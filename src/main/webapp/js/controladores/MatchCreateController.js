/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("MatchCreateController", function($scope, $http, $location){
	
	$scope.match = {};
	$scope.teams = [];
	$scope.flagLoading = false;
	$scope.flagErrorLoading = false;
	$scope.dateOptions = {
			formatYear: 'yy',
		    maxDate: new Date(2020, 5, 22),
		    minDate: new Date(),
		    startingDay: 1
	};

	
	
	
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = 
		$http.get( CONSTANTS.contextPath + "/services/teams" );
		request.success( function( response )
		{
			$scope.teams = response;
			$scope.flagLoading = false;
			NProgress.done();
		} );
		request.error( function( error )
		{
			$scope.flagLoading = false;
			$scope.flagErrorLoading = true;
			NProgress.done();
		});
	};
	
	
	
	$scope.save = function(){
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = $http.put( CONSTANTS.contextPath + "/services/matches", $scope.match );
		request.success( function( response )
		{
			console.log( response );
			NProgress.done();
			$location.path('/match/'+ response.oid);
		} );
		request.error( function( error )
		{
			console.log(error);
			$scope.errorMsg= "Ocurrio un error al ingresar el equipo, intente más tarde";
			$scope.diplayError = true;
			NProgress.done();
		});
	};
	
	$scope.loadData();
	
	
});