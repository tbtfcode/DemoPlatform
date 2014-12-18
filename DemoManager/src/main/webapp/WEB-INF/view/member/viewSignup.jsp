<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<form role="form" action="/signup.do" method="post">
		<h2>Sign Up</h2>
		<div class="form-group">
			<table>
				<tr>
					<td><input type="text" class="form-control" name="firstName" placeholder="First Name" required></td>
					<td><input type="text" class="form-control" name="lastName" placeholder="Last Name" required></td>
				</tr>
			</table>
		</div>
		<div class="form-group">
			<input type="email" class="form-control" name="j_username" placeholder="Email Address" required>
		</div>
		<div class="form-group">
			<input type="email" class="form-control" name="r_username" placeholder="Re-enter Email Address" required>
		</div>
		<div class="form-group">
			<input type="password" class="form-control" name="j_password" placeholder="New Password" required>
		</div>
		<button class="btn btn-lg btn-success btn-block" type="submit">Sign Up</button>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
	</form>
	<h2>${SPRING_SECURITY_LAST_EXCEPTION.message}</h2>
</div>
