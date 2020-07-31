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
				<td><input type="text" placeholder="Username" name="userName" required /></td>
			</tr>
			<tr>	
				<td><input type="password" placeholder="Password" name="userPassword" required/></td>			
			</tr>
			<tr>	
				<td><input type="submit"  class="submitButton"  value="Login"  /></td>
			</tr>
		</table>
	</form>
</body>
</html>