<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div ng-controller="DOMMemberController">
Header Information
	<a href="#" class="btn btn-default" role="button"><span class="glyphicon glyphicon-user"></span> My Info</a>
	<a href="#" ng-click="doLogout('${_csrf.token}')" class="btn btn-default" role="button"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
</div>