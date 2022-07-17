<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.center{
  margin-left: auto;
  margin-right: auto;
}


</style>


</head>
<body>
<h1 align="center">Welcome to Register Page</h1>
<form action="Register">
<table class="center">
<tr><td>User Id</td>&emsp;<td><input type="text" name="userid"></td></tr>
<tr><td>User Name</td>&emsp;<td><input type="text" name="username"></td></tr>
<tr><td>Password</td>&emsp;<td><input type="password" name="password"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit"></td></tr>
</table>
</form>

<br>
<br>
<br>

<table align="center">
<tr><td>Already signed in please&nbsp;<a href="Login.jsp">log in</a></td></tr>
</table>

</body>
</html>