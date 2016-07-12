/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("TeamController", function($scope, $http)
{
	$scope.teams = [];
	
	$scope.teams.push( {oid:1,name:"Chicago Bulls", gender:'MALE', description:'', category:'ADULT', image:'cbulls.png'} );
	$scope.teams.push( {oid:1,name:"Boston Celtics", gender:'MALE', description:'', category:'ADULT', image:'bos.png'} );
	$scope.teams.push( {oid:1,name:"Boston Celtics", gender:'MALE', description:'', category:'ADULT', image:'bos.png'} );
	$scope.teams.push( {oid:1,name:"Chicago Bulls", gender:'MALE', description:'', category:'ADULT', image:'cbulls.png'} );
});