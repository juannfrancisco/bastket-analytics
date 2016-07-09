/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("TeamProfileController", function($scope, $http)
{
	
	var bio = 'es un equipo de baloncesto profesional de la NBA con sede en Chicago, Illinois, fundado en 1966. Es el tercer equipo profesional con sede en esta ciudad tras Chicago Packers/Zephyrs y Chicago Stags, equipo que participó en los años 1940 en la BAA, antigua denominación de la liga profesional norteamericana de baloncesto.';
	var player1 = {oid:1, name:'Juan Francisco', lastName:'Maldonado', number:23, position:'SHOOTING_GUARD', image:'jordan.jpg'};
	var player2 = {oid:1, name:'Scottie', lastName:'Pipen', number:33, position:'POWER_FORWARD', image:'pipen.jpg'};
	$scope.team = {oid:1, name:"Chicago Bulls", bio:bio,gender:'MALE', description:'', category:'ADULT', image:'cbulls.png', playeers:[player1,player2]};
});