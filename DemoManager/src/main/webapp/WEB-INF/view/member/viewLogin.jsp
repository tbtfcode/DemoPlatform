<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
<!--
	<form class="form-signin" role="form">
		<h2 class="form-signin-heading">Please sign in</h2>
-->
	<form role="form">
		<h2>Please Sign In</h2>
		<div class="form-group">
			<label for="userId" class="sr-only">Email Address</label>
			<input type="email" class="form-control" id="userId" placeholder="Email Address" required autofocus />
			<label for="userPw" class="sr-only">Password</label>
			<input type="password" class="form-control" id="userPw" placeholder="Password" required />
		</div>
		<div class="checkbox">
			<label>
				<input type="checkbox" value="remember-me"> Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>
	</form>
</div>
<!--
<html><head><title>Login Page</title></head><body onload='document.f.j_username.focus();'>
<h3>Login with Username and Password</h3><form name='f' action='/DemoManage/j_spring_security_check' method='POST'>
 <table>
    <tr><td>User:</td><td><input type='text' name='j_username' value=''></td></tr>
    <tr><td>Password:</td><td><input type='password' name='j_password'/></td></tr>
    <tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
  </table>
</form></body></html>
-->