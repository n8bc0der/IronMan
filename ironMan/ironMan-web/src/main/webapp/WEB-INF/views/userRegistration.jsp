<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Page</title>
<style>

.normalFormBody {
  background-image: url('resources/images/ironManWallpaper.jpg');
  color: white;
  font-family: Calibri, sans-serif;
  font-size: 30px;
  margin-left: 50px;
  
}
 .heading{
	font-size: 50px;
}

input[type="text"] {
	font-size: 18px;
	padding: 8px 10px;
    width: 350px;
    border-color: #bdc7d8;
    border-radius: 5px;
    margin: 5px;
}

input[type="date"] {
	font-size: 18px;
	padding: 8px 10px;
    width: 350px;
    border-color: #bdc7d8;
    border-radius: 5px;
    margin: 5px;
}
input[type="password"] {
	font-size: 18px;
	padding: 8px 10px;
    width: 350px;
    border-color: #bdc7d8;
    border-radius: 5px;
    margin: 5px;
}

input[type="password"] {
	font-size: 18px;
	padding: 8px 10px;
    width: 350px;
    border-color: #bdc7d8;
    border-radius: 5px;
    margin: 5px;
}

input[type="radio"] {
	font-size: 18px;
	padding: 8px 10px;
    border-color: #bdc7d8;
    border-radius: 5px;
}

.submitButton {
	font-size: 18px;
	padding: 8px 10px;
    border-color: #bdc7d8;
    border-radius: 5px;
    font-weight: bold !important;
    background-color: #69a74e;
    border-color: #3b6e22;
    width: 150px;
    color: white;
}
.submitButton:hover{
	filter: brightness(85%);
}

</style>
</head>
<body class="normalFormBody">
	<h1 class="heading">Let's set you up</h1>
	</br>
	<form>
		<table>
			<tr>
				<td><input type="text" style="width:155px" placeholder="First Name" required>
					<input type="text" style="width:155px" placeholder="Last Name" required>
				</td>
			</tr>
			<tr>
				<td>Date of Birth<br /> <input type="date" required></td>
			</tr>
			<tr>
				<td><input type="text" placeholder="Email" required/></td>
			</tr>
			<tr>
				<td>Gender<br/> 
				    <input type="radio" id="male" name="gender" value="male"> <label for="male">Male</label> 
				    <input type="radio" id="female" name="gender" value="female"> <label for="female">Female</label>
				    <input type="radio" id="other" name="gender" value="other"> <label for="other">Other</label>
				</td>
			</tr>
			<tr>
				<td><input type="text" placeholder="Preferred Username" required /></td>
			</tr>
			<tr>
				<td><input type="password" placeholder="Password" required/></td>
			</tr>
			<tr>
				<td><input type="password" placeholder="Confirm Password" required/></td>
			</tr>
			<tr>
				<td><input type="submit"  class="submitButton"  value="Submit"  /></td>
			</tr>
		</table>
	</form>
</body>
</html>