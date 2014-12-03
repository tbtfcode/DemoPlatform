<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="_default_meta" />
	<tiles:insertAttribute name="_default_css" />

	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.4/angular.min.js"></script>
	<!-- script src="https://code.angularjs.org/1.3.4/angular.min.js"></script -->

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	<![endif]-->
	<title>Welcome to Tiles2</title>
</head>
<body ng-app=DOMCommonModule ng-strict-di>
	<div class="container">
		<div class="row">
			<div class="col-lg-12"><tiles:insertAttribute name="_default_header" /></div>
		</div>
		<div class="row">
			<div class="col-lg-12"><tiles:insertAttribute name="_default_menu_top" /></div>
			<div class="row">
				<div class="col-lg-3"><tiles:insertAttribute name="_default_menu_left" /></div>
				<div class="col-lg-9"><tiles:insertAttribute name="_content" /></div>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-12"><tiles:insertAttribute name="_default_footer" /></div>
		</div>
	</div>
	<tiles:insertAttribute name="_default_script" />
</body>
</html>