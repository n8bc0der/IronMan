<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/common-form.css">
</head>

<body class="normalFormBody">
	<h1 class="heading">Welcome</h1>
	<form action="showLoginPage">
		<table>
			<tr>
				<td>
					<input type="text" placeholder="Username" name="userName" required />
					<a href="registrationPage.html" class="normalTextSize">New user?</a>
				</td>
			</tr>
			<tr>	
				<td>
					<input type="password" placeholder="Password" name="userPassword" required/>
					<a style="color:#C8C8C8;" href="recover_password.html" class="normalTextSize">Forgot password?</a>
				</td>			
			</tr>
			<tr>	
				<td>
					<input type="submit"  class="submitButton"  value="Launch"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>