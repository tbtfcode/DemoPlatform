<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="_default_meta" />
	<tiles:insertAttribute name="_default_css" />
	<tiles:insertAttribute name="_default_script_preload" />

	<title>Formatted-Page for Popup</title>
</head>
<body ng-app="DOMCommonModule" ng-strict-di>
	<div class="container">
		<div class="row">
			<div class="col-lg-8"><tiles:insertAttribute name="_content" /></div>
		</div>
	</div>
	<tiles:insertAttribute name="_default_script_afterload" />
</body>
</html>