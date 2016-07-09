<section id="main" role="main">
    <div class="container-fluid">
    
    	
		<section class="jumbotron jumbotron-bg11 mt-15 mb15 mr-15 ml-15" data-stellar-background-ratio="0.4" 
		style="min-height: 320px; background-position: 50% 30px; background-image: url('<%=request.getContextPath() %>/image/stellar/background-bulls.jpg') !important; ">
		    <div class="overlay pattern pattern10"></div>
		    <div class="container" style="padding-top:8%;">
		        <h1 class="thin text-white text-center font-alt">{{team.name}}</h1>
		        <h4 class="thin text-white text-center">Cantidad de jugadores {{team.playeers.length}}</h4>
		    </div>
		</section>
    
    
    
    
    
        <div class="page-header page-header-block">
            <div class="page-header-section">
                <h4 class="title semibold">{{team.name}}</h4>
            </div>
            <div class="page-header-section">
                <div class="toolbar">
                    <ol class="breadcrumb breadcrumb-transparent nm">
                        <li><a href="#/team/edit/{{team.oid}}">Editar</a></li>
                        <li><a href="#/teams">Todos los Equipos</a></li>
                    </ol>
                </div>
            </div>
        </div>
        
        <div class="row" >
        	<div class="col-md-6">
        		<div class="panel panel-default" id="toolbar-showcase">
	                <div class="panel-heading">
	                    <h3 class="panel-title"><span class="panel-icon mr5"><i class="ico-list22"></i></span> Informaci�n</h3>
	                </div>
	               <div class="panel-body panel-collapse pull out">
	               		<div class="row">
	               			<div class="col-md-12"> {{team.bio}} </div>
	               		</div>
	               		<hr/>
	               		<div class="row">
	               			<div class="col-md-6">
	               				<b>A�o limite</b> <br/>{{team.anioLimite}} 
	               			</div>
	               			<div class="col-md-6">
	               				<b>Equipo</b> <br/>{{team.gender}}
	               			</div>
	               		</div>
	               </div>
            </div>
        	
        	</div>
 	       	<div class="col-md-6">
 	       	
 	       	
 	       	<div class="panel panel-default" id="toolbar-showcase">
	                <div class="panel-heading">
	                    <h3 class="panel-title"><span class="panel-icon mr5"><i class="ico-list22"></i></span> Jugadores</h3>
	                </div>
	                <div class="panel-body panel-collapse pull out" style="padding:0px;">
        				<div class="media-list">
							<a href="javascript:void(0);" class="media border-dotted" ng-show="team.playeers.length==0">		                      
		                      <span class="media-body">
		                          <span class="media-text ellipsis nm">No se han asignado jugadores al equipo.</span>		                          
		                      </span>
		                  	</a>
			        		<a href="javascript:void(0);" class="media border-dotted" ng-repeat="player in team.playeers | filter:q as results">
			                      <span class="pull-left">
			                          <img ng-src="<%=request.getContextPath() %>/image/avatar/{{player.image}}" class="media-object" alt="">
			                      </span>
			                      <span class="media-body">
			                          <span class="media-heading">{{player.name}}</span>
			                          <span class="media-text ellipsis nm">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod.</span>
			                          <span class="media-meta">2m</span>
			                      </span>
			                  </a>
			              </div>
        			</div>
        		</div>

        	</div>
        </div>
    </div>
</section>


<script>
$.stellar({horizontalScrolling: false});
</script>