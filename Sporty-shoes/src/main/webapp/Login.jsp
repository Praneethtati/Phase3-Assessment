<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.center {
  margin-left: auto;
  margin-right: auto;
}



div{
margin-top:100px;
}


</style>

</head>
<body>
<div>
<h1 align="center">Welcome to Login Page</h1>

<form action="Login">

<table class="center">
<tr><td>User Name</td><td><input type="text" name="username"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit"></td></tr>
</table>

</form>

<br>
<br>
<br>

<table align="center">
<tr><td><a href="Register.jsp">Please Register here</a></td></tr>
</table>
</div>
</body>

</html>