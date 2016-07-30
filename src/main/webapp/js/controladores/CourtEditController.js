/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("CourtEditController", function($scope, $http, $routeParams)
{
	$scope.flagLoading = false;
	$scope.flagErrorLoading = false;
	
	/**
	 * 
	 */
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
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
			$scope.flagLoading = false;
			$scope.flagErrorLoading = true;
			NProgress.done();
		});
	};
	
	$scope.loadData();	
});