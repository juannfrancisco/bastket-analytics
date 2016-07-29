/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("CourtProfileController", function($scope, $http, $routeParams)
{	
	$scope.flagLoading = true;
	$scope.flagErrorLoading = false;
	$scope.court = {};
	
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
//		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		var request = 
		$http.get( CONSTANTS.contextPath + "/services/courts/" + $routeParams.id );
		request.success( function( response )
		{
			$scope.court = response;
			$scope.flagLoading = false;
			NProgress.done();
		} );
		request.error( function( error )
		{
			$scope.flagErrorLoading = true;
			$scope.flagLoading = false;
			NProgress.done();
		});
	};
	
	
	$scope.loadData();
	
	
	
});