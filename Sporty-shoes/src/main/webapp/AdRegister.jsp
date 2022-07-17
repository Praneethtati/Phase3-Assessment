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

<h1 align="center">Welcome to administrator Register Page</h1>
<form action="AdRegister">
<table class="center">
<tr><td>AdminId</td>&emsp;<td><input type="text" name="adid"></td></tr>
<tr><td>AdminName</td>&emsp;<td><input type="text" name="adname"></td></tr>
<tr><td>AdminPassword</td>&emsp;<td><input type="password" name="adpassword"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit"></td></tr>
</table>
</form>

</body>
</html>