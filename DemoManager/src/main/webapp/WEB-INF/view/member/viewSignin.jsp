<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<form role="form" action="/j_spring_security_check" method="post">
		<h2>Sign In</h2>
		<div class="form-group">
			<label for="j_username" class="sr-only">Email Address</label>
			<input type="email" class="form-control" name="j_username" placeholder="Email Address" required autofocus>
		</div>
		<div class="form-group">
			<label for="j_password" class="sr-only">Password</label>
			<input type="password" class="form-control" name="j_password" placeholder="Password" required>
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
</div>
