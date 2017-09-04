/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador MatchPlayingController
 *************************************************************/
app.controller("MatchPlayingController", ['$scope', '$http', '$routeParams', '$interval', '$uibModal',
function($scope, $http, $routeParams, $interval,$uibModal)
{
	$scope.flagLoading = true;
	$scope.time = 600;
	$scope.timetext = "00:00:00";
	$scope.score = { visitor:0, local:0 };
	$scope.scoreText = { visitor:{d1:0, d2:0, d3:0}, local:{ d1:0, d2:0, d3:0 } };
	$scope.point = {team:'', score:0};

	/**
	 *
	 */
	$scope.loadData = function()
	{
		$scope.flagLoading = true;
//		NProgress.configure({ parent: '#main' });
		NProgress.start();

		var request =
		$http.get( CONSTANTS.contextPath + "/services/matches/" + $routeParams.id );
		request.success( function( response )
		{
			$scope.match = response;
			$scope.match.date = new Date( $scope.match.date );
			$scope.flagLoading = false;
			NProgress.done();
		} );
		request.error( function( error )
		{
			$scope.flagLoading = false;
			NProgress.done();
		});
	};
	$scope.loadData();




//	$scope.addPoint = function(){
//		$scope.score.visitor = $scope.point.team === 'visitor' ? $scope.score.visitor+ $scope.point.score: $scope.score.visitor;
//		$scope.score.local = $scope.point.team === 'local' ? $scope.score.local+ $scope.point.score: $scope.score.local;
//
//		$scope.calculateDigit($scope.score.local, $scope.scoreText.local);
//		$scope.calculateDigit($scope.score.visitor, $scope.scoreText.visitor);
//
//		$scope.point.team = '';
//		$scope.point.score = 0;
//		$('#modal-add-point').modal('hide');
//	};


	$scope.calculateDigit = function( score , scoreText ){
		var digits = [];
		var i = 0;
		while( i < 3  ){
			var digit = score % 10;
			score = Math.floor(score/10);
			digits.push(digit);
			i++;
		}
		scoreText.d3 = digits[0];
		scoreText.d2 = digits[1];
		scoreText.d1 = digits[2];

		return digits;
	};

	var stop;
	$scope.stateWatch = "stop"
	
	$scope.startCount = function(){
		if ( angular.isDefined(stop) ) return;
		$scope.stateWatch = "play"
		stop = $interval(function() {
			if ($scope.time > 0 ) {
				$scope.time = $scope.time -1;
				var hour =Math.floor( $scope.time / 3600 );
				var min = Math.floor( $scope.time / 60 );
				var seconds = $scope.time % 60;
				$scope.timetext = (hour <10 ? "0"+hour:hour) + ":" + (min <10 ? "0"+ min: min) + ":"+ (seconds<10 ? "0"+seconds: seconds);
			} else {
				$scope.pauseCount();
			}
        }, 1000);
	};


	$scope.pauseCount = function(){
		if (angular.isDefined(stop)) {
            $interval.cancel(stop);
            stop = undefined;
            $scope.stateWatch = "pause";
          }
	};
	
	$scope.stopCount = function(){
		
		if (angular.isDefined(stop)) {
            $interval.cancel(stop);
            stop = undefined;
        }
		$scope.time = 600;
        $scope.timetext = "00:00:00";
        $scope.stateWatch = "stop";
 
	};
	
	/**
	 * 
	 */
	$scope.addCrew = function(){
		var modalInstance = $uibModal.open({
            animation: true,
            backdrop : false,
            templateUrl: 'pages/matches/modal-add-crew.html',
            controller: 'ModalAddCrew',
            size :'lg',
            resolve: {
                match: function () {
                  return $scope.match;
                }
              }
        });
		
		modalInstance.result.then(function (selectedItem) {
			
	    }, function () {
	      console.log("xxssss");
	    });
	};

	
	/**
	 * 
	 */
	$scope.optionPlayer = function( player, type ){
		var modalInstance = $uibModal.open({
            animation: true,
            backdrop : false,
            templateUrl: 'pages/matches/modal-option-player.html',
            controller: 'ModalOptionPlayer',
            size :'lg',
            resolve: {
            	player: function () {
                  return player;
                },
                score : function(){
                	return $scope.score[type];
                }
              }
        });
		
		modalInstance.result.then(function (scoreNew) {
			$scope.score[type] = $scope.score[type]+ scoreNew; 
			$scope.calculateDigit($scope.score[type], $scope.scoreText[type] );
	    }, function () {
	      console.log("xxssss");
	    });
	};



}]);




/**
 * 
 */
app.controller("ModalAddCrew", ['$scope','$uibModalInstance', 'match',
function($scope,$uibModalInstance, match )
{
	$scope.match = match;
	$scope.selectedTeam = false;
	$scope.listPlayers = [];
	
	/**
	 * 
	 */
	$scope.selectTeam  = function(team){
		$scope.selectedTeam = true;
		$scope.team = team;
		$scope.players = angular.copy(team.players);
		$scope.normalizeData( $scope.players );
	}
	
	
	/**
	 * 
	 */
	$scope.normalizeData = function(players){
		for( i in players){
			if( players[i].titular ){
				$scope.listPlayers[players[i].oid] = players[i].oid;
			}
		}
		$scope.totalSelected = Object.keys($scope.listPlayers).length
	}
	
	/**
	 * 
	 */
	$scope.cancel = function()
	{
		$uibModalInstance.close( [] );
	}
	
	/**
	 * 
	 */
	$scope.addCrew = function(){
		
		for( i in $scope.team.players ){
			$scope.team.players[i].titular = false;
			$scope.team.players[i].titular = $scope.listPlayers[$scope.team.players[i].oid] && $scope.listPlayers[$scope.team.players[i].oid].titular;
		}
		$uibModalInstance.close( $scope.listPlayers );
	}
	
	
	/**
	 * 
	 */
	$scope.selectPlayer = function(player){
		$scope.q = "";
		$scope.totalSelected = Object.keys($scope.listPlayers).length;
		
		if( !player.titular ){
			if( $scope.totalSelected < 5 ){
				$scope.listPlayers[player.oid] = player;
				player.titular = !player.titular;
			}
		}else
		{
			delete $scope.listPlayers[player.oid]
			player.titular = !player.titular;
		}
		$scope.totalSelected = Object.keys($scope.listPlayers).length;
	}
 }]);



app.controller("ModalOptionPlayer", ['$scope','$uibModalInstance', 'player', 'score',
function($scope,$uibModalInstance, player, score )
{
	$scope.player = player;
	console.log(player);
	
	/**
	 * 
	 */
	$scope.addPoint = function(point){
		$uibModalInstance.close( point );
		player.totalPoints = player.totalPoints + point;
		player.points = player.points ? player.points : []; 
		player.points.push( { date: new Date(), point:point } );
		console.log( player.points );
	}
	
	/**
	 * 
	 */
	$scope.addFoul = function(){
		player.fouls = player.fouls? player.fouls + 1 : 0;
		$uibModalInstance.close( 0 );
	}
	
	/**
	 * 
	 */
	$scope.close = function()
	{
		$uibModalInstance.close( 0 );
	}
}]);
