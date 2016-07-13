var app = angular.module('App', ['ngRoute']).config(function($routeProvider, $controllerProvider) 
{
	app.registerCtrl = $controllerProvider.register;
	$routeProvider
    .when('/', 
    {
    	controller:'DashboardController',
    	templateUrl:  CONSTANTS.contextPath + '/app/inicio.html' 	
    })
    
    .when('/teams',{controller:'TeamController',templateUrl:  CONSTANTS.contextPath + '/app/pages/teams/teams.html'})
    .when('/team/create',{controller:'TeamCreateController',templateUrl:  CONSTANTS.contextPath + '/app/pages/teams/team-create.html'})
    .when('/team/:id',{controller:'TeamProfileController',templateUrl:  CONSTANTS.contextPath + '/app/pages/teams/team-profile.html'})
    .when('/team/edit/:id',{controller:'TeamEditController',templateUrl:  CONSTANTS.contextPath + '/app/pages/teams/team-edit.html'})
    
    .when('/administracion/usuarios',{controller:'UsuarioController',templateUrl:  CONSTANTS.contextPath + '/app/pages/administracion/usuarios/usuarios.jsp'})
    .otherwise(
    {
    	redirectTo:'/'
    });
	
});




/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("DashboardController", function($scope, $http, $location)
{
	
	$scope.ref = function( link ){
		$location.url( link );
	};
	
});