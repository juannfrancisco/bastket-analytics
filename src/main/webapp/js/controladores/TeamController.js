/*************************************************************
 * @author Juan Francisco ( juan.maldonado.leon@gmail.com )
 * @desc Controlador PerfilEquipoController
 *************************************************************/
app.controller("TeamController", function($scope, $http, $location){
	
	$scope.ref = function( link ){
		$location.url( link );
	};
	
	
	$scope.teams = [];
//	
//	$scope.teams.push( {oid:1,name:"Chicago Bulls", gender:'MALE', description:'', category:'ADULT', image:'cbulls.png'} );
//	$scope.teams.push( {oid:1,name:"Boston Celtics", gender:'MALE', description:'', category:'ADULT', image:'bos.png'} );
//	$scope.teams.push( {oid:1,name:"Boston Celtics", gender:'MALE', description:'', category:'ADULT', image:'bos.png'} );
//	$scope.teams.push( {oid:1,name:"Chicago Bulls", gender:'MALE', description:'', category:'ADULT', image:'cbulls.png'} );
//	
	$scope.flagLoading = false;
	
	$scope.loadData = function(  )
	{
		$scope.flagLoading = true;
		
		var request = 
		$http.get( CONSTANTS.contextPath + "/services/teams" );
		request.success( function( response )
		{
			$scope.teams = response;
			$scope.flagLoading = false;
		} );
		request.error( function( error )
		{
			alert( error );
			$scope.flagLoading = false;
		});
	};
	
	
	$scope.loadData();
	
	
});