<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<tiles:insertAttribute name="_default_meta" />
	<tiles:insertAttribute name="_default_css" />
	<tiles:insertAttribute name="_default_script" />

	<title>Formatted-Page for Login</title>
</head>
<body ng-app="DOMManageModule" ng-strict-di>
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<tiles:insertAttribute name="_default_header" />
			</div>
		</div>
		<div class="row">
			<div class="col-lg-2"></div>
			<div class="col-lg-4">
				<tiles:insertAttribute name="_content_signin" />
			</div>
			<div class="col-lg-4">
				<tiles:insertAttribute name="_content_signup" />
			</div>
			<div class="col-lg-2"></div>
		</div>
		<div class="row">
			<div class="col-lg-12">
				<tiles:insertAttribute name="_default_footer" />
			</div>
		</div>
	</div>
</body>
</html>