/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("TeamProfileController", function($scope, $http)
{
	$scope.team = {oid:1,name:"Chicago Bulls", gender:'MALE', description:'', category:'ADULT', image:'cbulls.png', playeers:[]};
});