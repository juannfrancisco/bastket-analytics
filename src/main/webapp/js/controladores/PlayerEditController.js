/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("PlayerEditController", ['$scope', '$http', '$routeParams',function($scope, $http, $routeParams)
{
	$scope.flagLoading = true;
	$scope.flagErrorLoading = false;
	$scope.player = {};

	$scope.loadData = function( )
	{
		$scope.flagLoading = true;
//		NProgress.configure({ parent: '#main' });
		NProgress.start();

		var request =
		$http.get( CONSTANTS.contextPath + "/services/players/" + $routeParams.idPlayer );
		request.success( function( response )
		{
			$scope.player = response;
			$scope.player.birthdate = new Date($scope.player.birthdate);
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



}]);
