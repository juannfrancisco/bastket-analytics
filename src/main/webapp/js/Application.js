var app = angular.module('App', ['ngRoute']).config(function($routeProvider, $controllerProvider) 
{
	app.registerCtrl = $controllerProvider.register;
	$routeProvider
    .when('/', 
    {
    	controller:'DashboardController',
    	templateUrl: 'inicio.html' 	
    })
    
    .when('/teams',{controller:'TeamController',templateUrl: 'pages/teams/teams.html'})
    .when('/team/create',{controller:'TeamCreateController',templateUrl:  'pages/teams/team-create.html'})
    .when('/team/:id',{controller:'TeamProfileController',templateUrl:  'pages/teams/team-profile.html'})
    .when('/team/edit/:id',{controller:'TeamEditController',templateUrl:  'pages/teams/team-edit.html'})
    
    .when('/administracion/usuarios',{controller:'UsuarioController',templateUrl:  'pages/administracion/usuarios/usuarios.jsp'})
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