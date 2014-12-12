<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div ng-controller="DOMMemberController">
	<!-- form role="form" action="/loginAuthentication" method="post" -->
	<form role="form" ng-submit="doLogin('${_csrf.token}')">
		<h2>Please Sign In</h2>
		<div class="form-group">
			<label for="userId" class="sr-only">Email Address</label>
			<!-- input type="email" class="form-control" name="userId" placeholder="Email Address" required autofocus -->
			<input type="email" class="form-control" ng-model="doLoginDTO.userId" placeholder="Email Address" required autofocus>
			<label for="userPw" class="sr-only">Password</label>
			<!-- input type="password" class="form-control" name="userPw" placeholder="Password" required -->
			<input type="password" class="form-control" ng-model="doLoginDTO.userPw" placeholder="Password" required>
		</div>
		<div class="checkbox">
			<label>
				<input type="checkbox" value="remember-me"> Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>

		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	</form>
	<h2>${SPRING_SECURITY_LAST_EXCEPTION.message}</h2>
	<h2>{{doLoginDTO.errorMessage}}</h2>
</div>
