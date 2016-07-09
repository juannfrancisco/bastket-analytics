<section id="main" role="main">
    <div class="container-fluid">
        <div class="page-header page-header-block">
            <div class="page-header-section">
                <h4 class="title semibold">Equipos</h4>
            </div>
            <div class="page-header-section">
                <div class="toolbar">
                    <div class="col-md-6 col-md-offset-6">
                        <div class="panel-toolbar">
                            <div class="input-group">
                                <div class="has-icon">
                                    <input type="text" ng-model="q" placeholder="buscar" class="form-control" />
                                    <i class="ico-search form-control-icon"></i>
                                </div>
                                <div class="input-group-btn">
                                	<a href="#/team/create" class="btn btn-default">Nuevo</a>
                                    	                                        
                                </div>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
        
        <div class="row" >
        
        	
        
        	<div class="col-xs-6 col-md-2" ng-repeat="e in teams | filter:q as results">
        		<div class="thumbnail thumbnail-album animation animating  fadeInLeft">
                   <div class="media">
                       <div class="indicator"><span class="spinner"></span></div>
                       <div class="overlay">
                           <div class="toolbar">
                               <a href="#/team/{{e.oid}}" class="btn btn-default" title="upload to collection"><i class="ico-eye"></i></a>
                               <a href="#/team/edit/{{e.oid}}" class="btn btn-success" title="watch collection"><i class="ico-edit"></i></a>
                               <a href="javascript:void(0);" class="btn btn-default" ng-click="eliminar(e)"><i class="ico-remove4"></i></a>
                           </div>
                       </div>
                       <img data-toggle="unveil" ng-src="<%=request.getContextPath() %>/image/team/{{e.image}}" 
                       	 alt="Cover" width="100%" class="unveiled">
                   </div>
                   <div class="caption">
                       <h5 class="semibold mt0 mb5">{{e.name}}</h5>
                       <p class="text-muted mb5 ellipsis">
                       	<b>{{e.category}}</b> | {{e.gender}}  
                       </p>
                   </div>
               </div>
           </div>
           
			<div class="col-md-12" ng-if="teams.length == 0">
      			<strong>No existen equipos, presione el boton "nuevo" para agregar un equipo...</strong>
			</div>
           
           
           
           
        
        </div>
        
    </div>
</section>