/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("PlayerCreateController", function( $scope, $http, $location, $routeParams )
{
	$scope.player = {};
	
	
	$scope.save = function(){
		
		NProgress.configure({ parent: '#main' });
		NProgress.start();
		
		if( $routeParams.id )
			var request = $http.put( CONSTANTS.contextPath + "/services/teams/"+ $routeParams.id + "/players" , $scope.player );
		else
			var request = $http.put( CONSTANTS.contextPath + "/services/players/" );
		
		request.success( function( response )
		{
			console.log( response );
			NProgress.done();
			$location.path('/teams');
		} );
		request.error( function( error )
		{
			console.log(error);
			$scope.errorMsg= "Ocurrio un error al ingresar el equipo, intente más tarde";
			$scope.diplayError = true;
			NProgress.done();
		});
	};
	
});