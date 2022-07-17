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

.container{
  width: 100%;
  text-align: center;
}
</style>

</head>
<body>
<h1 align="center">Welcome to user delete page</h1>
<form action="UserDelete">
<table class="center">
<tr><td>User Id</td>&emsp;<td><input type="text" name="userid"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit" value="Delete"></td></tr>
</table>
</form>
<div class="container">
<a href="UsersDisplaybu.jsp">View all the Users here</a>
</div>
</body>
</html>