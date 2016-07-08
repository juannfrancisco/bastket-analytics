<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
<aside class="sidebar sidebar-left sidebar-menu">
    <!-- START Sidebar Content -->
    <section class="content slimscroll">	
	<h5 class="heading">Main Menu</h5>
    <ul class="topmenu topmenu-responsive" data-toggle="menu">
    
    
    	<li >
            <a href="javascript:void(0);" data-target="#dashboard" data-toggle="submenu" data-parent=".topmenu">
                <span class="figure"><i class="ico-dashboard2"></i></span>
                <span class="text">Administración</span>
                <span class="arrow"></span>
            </a>
            <ul id="dashboard" class="submenu collapse ">
                <li class="submenu-header ellipsis">Administración</li>
                <li >
                    <a href="inicio#/administracion/usuarios"><span class="text">Usuarios</span></a>
                </li>
                <li >
                    <a href="inicio#/administracion/perfiles"><span class="text">Perfiles</span></a>
                </li>
                <li >
                    <a href="inicio#/administracion/socios"><span class="text">Socios</span></a>
                </li>
            </ul>
        </li>
        
        <li >
            <a href="javascript:void(0);" data-target="#teams" data-toggle="submenu" data-parent=".topmenu">
                <span class="figure"><i class="ico-dashboard2"></i></span>
                <span class="text">Equipos</span>
                <span class="arrow"></span>
            </a>
            <ul id="teams" class="submenu collapse ">
                <li class="submenu-header ellipsis">Equipos</li>
                <li >
                    <a href="#/teams"><span class="text">Equipos</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedores/profesores"><span class="text">Profesores</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedores/jugadores"><span class="text">Jugadores</span></a>
                </li>
            </ul>
        </li>
            
        <li>
            <a href="javascript:void(0);" data-target="#components" data-toggle="submenu" data-parent=".topmenu">
                <span class="figure"><i class="ico-screwdriver"></i></span>
                <span class="text">Mantenedores</span>
                <span class="arrow"></span>
            </a>
            <ul id="components" class="submenu collapse ">
                <li class="submenu-header ellipsis">Mantenedores</li>
                <li >
                    <a href="inicio#/mantenedor/categoria"><span class="text">Categoria Socio</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedor/centrocosto"><span class="text">Centro Costo</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedor/profesion"><span class="text">Profesi&oacute;n</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedor/tipogasto"><span class="text">Tipo Gasto</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedor/tipoingreso"><span class="text">Tipo Ingreso</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedor/tiposocio"><span class="text">Tipo Socio</span></a>
                </li>
                <li >
                    <a href="inicio#/mantenedor/tipoprofesor"><span class="text">Tipo Profesor</span></a>
                </li>
            </ul>
        </li>
    
		<li >
		    <a href="javascript:void(0);" data-toggle="submenu" data-target="#form" data-parent=".topmenu">
		        <span class="figure"><i class="ico-quill2"></i></span>
		        <span class="text">Ingresos</span>
		        <span class="arrow"></span>
		    </a>
		    <ul id="form" class="submenu collapse ">
		        <li >
		            <a href="inicio#/ingreso/cuotas"> <span class="text">Cuotas</span> </a>
		        </li>
		        <li >
		            <a href="inicio#/ingreso/valorCuota"> <span class="text">Valor Cuotas</span> </a>
		        </li>
		        <li >
		            <a href="inicio#/ingreso/otros"> <span class="text">Otros Ingresos</span> </a>
		        </li>
		        <li >
		            <a href="inicio#/ingreso/gastos"> <span class="text">Gastos</span> </a>
		        </li>
		    </ul>
		</li>
		
		<li >
	        <a href="javascript:void(0);" data-toggle="submenu" data-target="#chart" data-parent=".topmenu">
	            <span class="figure"><i class="ico-stats-up"></i></span>
	            <span class="text">Reportes</span>
	            <span class="arrow"></span>
	        </a>
	        <ul id="chart" class="submenu collapse ">
	            <li class="submenu-header ellipsis">Reportes</li>
	            <li >
	                <a href="#"> <span class="text">Reporte 1</span> </a>
	            </li>
	            <li >
	                <a href="#"> <span class="text">Reporte 2</span> </a>
	            </li>
	            <li >
	                <a href="#"> <span class="text">Reporte 3</span> </a>
	            </li>
	        </ul>
	    </li>
            </section>
        </aside>