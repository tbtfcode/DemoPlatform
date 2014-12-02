<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<!-- Bootstrap -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">

		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.4/angular.min.js"></script>
		<!-- script src="https://code.angularjs.org/1.3.4/angular.min.js"></script -->
		<script src="http://localhost/DemoManage/js/manageModule.js"></script>
		<script src="http://localhost/DemoManage/js/memberController.js"></script>
		<script src="http://localhost/DemoManage/js/careerController.js"></script>
		<script src="http://localhost/DemoManage/lib/ui-utils.js"></script>
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

		<title>Welcome to DEMO~!!</title>
	</head>
	<body ng-app=DOMCommonModule ng-strict-di>
		<h1>Hello, world!</h1>

	<get-length>asdf</get-length>
<div ng-controller="DOMMemberController">
	<button type="button" lass="btn btn-lg btn-default" ng-click="greeting()">Greeting</button>{{greet}}
</div>
<div ng-controller="DOMCareerController">
	<button ng-click="greeting()">Greeting</button>{{greet}}
</div>
${result}
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
	</body>
</html>