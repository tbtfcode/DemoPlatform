<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<script src="http://localhost/DemoManage/js/manageModule.js"></script>
	<script src="http://localhost/DemoManage/js/memberController.js"></script>
	<script src="http://localhost/DemoManage/js/careerController.js"></script>
	<!-- script src="http://localhost/DemoManage/lib/ui-utils.js"></script -->

	<h1>Hello, world!</h1>

	<get-length>asdf</get-length>
<div ng-controller="DOMMemberController">
	<button type="button" lass="btn btn-lg btn-default" ng-click="greeting()">Greeting</button>{{greet}}
</div>
<div ng-controller="DOMCareerController">
	<button ng-click="greeting()">Greeting</button>{{greet}}
</div>
${result}

</div>
