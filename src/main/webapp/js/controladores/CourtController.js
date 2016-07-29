/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("CourtController", function($scope, $http, $location){
	
	
	$scope.players = [];
	$scope.flagLoading = false;
	$scope.flagErrorLoading = false;
	
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
//		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = 
		$http.get( CONSTANTS.contextPath + "/services/courts" );
		request.success( function( response )
		{
			$scope.courts = response;
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
	
	$scope.loadData();
	
	
});