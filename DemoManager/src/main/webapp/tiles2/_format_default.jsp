<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="_default_meta" />
	<tiles:insertAttribute name="_default_css" />
	<tiles:insertAttribute name="_default_script_preload" />

	<title>Formatted-Page for Default</title>
</head>
<body ng-app="DOMManageModule" ng-strict-di>
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
	<tiles:insertAttribute name="_default_script_afterload" />
</body>
</html>