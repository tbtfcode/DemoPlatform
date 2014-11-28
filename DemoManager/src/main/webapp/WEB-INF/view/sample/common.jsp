<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.4/angular.min.js"></script>
		<!-- script src="https://code.angularjs.org/1.3.4/angular.min.js"></script -->
		<script src="http://localhost/DemoManage/js/manageModule.js"></script>
		<script src="http://localhost/DemoManage/js/memberController.js"></script>
		<script src="http://localhost/DemoManage/js/careerController.js"></script>
		<script src="http://localhost/DemoManage/lib/ui-utils.js"></script>
		<title>Welcome to DEMO~!!</title>
	</head>
	<body ng-app=DOMCommonModule ng-strict-di>
	<get-length>asdf</get-length>
<div ng-controller="DOMMemberController">
	<button ng-click="greeting()">Greeting</button>{{greet}}
</div>
<div ng-controller="DOMCareerController">
	<button ng-click="greeting()">Greeting</button>{{greet}}
</div>
${result}
	</body>
</html>