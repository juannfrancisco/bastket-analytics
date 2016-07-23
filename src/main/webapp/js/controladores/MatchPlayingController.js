/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador MatchPlayingController
 *************************************************************/
app.controller("MatchPlayingController", function($scope, $http, $routeParams, $interval)
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
		NProgress.configure({ parent: '#main' });
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
	
	
	
	
	$scope.addPoint = function(){
		$scope.score.visitor = $scope.point.team === 'visitor' ? $scope.score.visitor+ $scope.point.score: $scope.score.visitor;
		$scope.score.local = $scope.point.team === 'local' ? $scope.score.local+ $scope.point.score: $scope.score.local;
		
		$scope.calculateDigit($scope.score.local, $scope.scoreText.local);
		$scope.calculateDigit($scope.score.visitor, $scope.scoreText.visitor);
		
		$scope.point.team = '';
		$scope.point.score = 0;
		$('#modal-add-point').modal('hide');
	};
	
	
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
	$scope.startCount = function(){
		if ( angular.isDefined(stop) ) return;
		stop = $interval(function() {
			if ($scope.time > 0 ) {
				$scope.time = $scope.time -1;
				var hour =Math.floor( $scope.time / 3600 );
				var min = Math.floor( $scope.time / 60 );
				var seconds = $scope.time % 60;
				$scope.timetext = (hour <10 ? "0"+hour:hour) + ":" + (min <10 ? "0"+ min: min) + ":"+ (seconds<10 ? "0"+seconds: seconds);
			} else {
				$scope.stopCount();
			}
        }, 1000);
	};
	
	
	$scope.stopCount = function(){
		if (angular.isDefined(stop)) {
            $interval.cancel(stop);
            stop = undefined;
          }
	};
	
	
	
	
	
	
});