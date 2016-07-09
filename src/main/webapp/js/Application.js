var app = angular.module('App', ['ngRoute']).config(function($routeProvider, $controllerProvider) 
{
	app.registerCtrl = $controllerProvider.register;
	$routeProvider
    .when('/', 
    {
    	controller:'DashboardController',
    	templateUrl:  CONSTANTS.contextPath + '/app/inicio.jsp' 	
    })
    
    .when('/teams',{controller:'TeamController',templateUrl:  CONSTANTS.contextPath + '/app/pages/equipos/equipos.jsp'})
    .when('/team/create',{controller:'CrearEquipoController',templateUrl:  CONSTANTS.contextPath + '/app/pages/equipos/nuevo.jsp'})
    .when('/team/:id',{controller:'TeamProfileController',templateUrl:  CONSTANTS.contextPath + '/app/pages/equipos/perfil.jsp'})
    .when('/team/edit/:id',{controller:'EditarEquipoController',templateUrl:  CONSTANTS.contextPath + '/app/pages/equipos/editar.jsp'})
    
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
app.controller("DashboardController", function($scope, $http)
{

});