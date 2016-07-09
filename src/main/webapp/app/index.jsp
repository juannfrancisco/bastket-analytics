<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="App" class="backend">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Basketball Analytics</title>
        <meta name="author" content="Maldonado León">
        <meta name="description" content="Portal de administracion">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=request.getContextPath() %>/image/touch/apple-touch-icon-144x144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=request.getContextPath() %>/image/touch/apple-touch-icon-114x114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=request.getContextPath() %>/image/touch/apple-touch-icon-72x72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath() %>/image/touch/apple-touch-icon-57x57-precomposed.png">
        <link rel="shortcut icon" href="<%=request.getContextPath() %>/image/favicon.ico">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheet/bootstrap.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheet/layout.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheet/uielement.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/stylesheet/themes/theme2.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/jquery-ui/css/jquery-ui.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/nprogress/css/nprogress.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/steps/css/jquery-steps.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/font-awesome/css/font-awesome.css">
        <link rel="stylesheet" href="<%=request.getContextPath() %>/plugins/gritter/css/gritter.css">
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/modernizr/js/modernizr.js"></script>
    </head>
    
    <body>
        
  		<jsp:include page="commons/header.jsp" />
  		<jsp:include page="commons/menu.jsp" />

        <section id="main" role="main" >
        	<div ng-view></div>
            <a href="javascript:void();" class="totop animation" data-toggle="waypoints totop" data-showanim="bounceIn" data-hideanim="bounceOut" data-offset="50%"><i class="ico-angle-up"></i></a>
        </section>
        <script type="text/javascript">
        	var CONSTANTS = 
        	{
        		contextPath : "<%=request.getContextPath() %>"
        	};
        </script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/angular.min.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/angular-resource.min.js"></script>
    		<script type="text/javascript" src="<%=request.getContextPath() %>/javascript/angular-route.min.js"></script>
        <!-- Descomentar si ambiente tiene conexion a internet -->
        <!-- script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-resource.min.js"></script>
    		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.min.js"></script-->
        <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/vendor.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/core.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/javascript/backend/app.js"></script>
       
       	<script type="text/javascript" src="<%=request.getContextPath() %>/plugins/jquery-ui/js/jquery-ui.js"></script>
       	<script type="text/javascript" src="<%=request.getContextPath() %>/plugins/stellar/js/jquery.stellar.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/parsley/js/parsley.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/steps/js/jquery-steps.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/nprogress/js/nprogress.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/inputmask/js/inputmask.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/bootbox/js/bootbox.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/plugins/gritter/js/jquery.gritter.js"></script>
        
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/Application.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/TeamController.js"></script>
        <script type="text/javascript" src="<%=request.getContextPath() %>/js/TeamProfileController.js"></script>
        
    </body>
    <!--/ END Body -->
</html>