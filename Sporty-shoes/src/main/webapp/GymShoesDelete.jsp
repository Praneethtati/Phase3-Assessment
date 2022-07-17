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
<h1 align="center">Gym Shoes delete</h1>

<form action="GymDelete">
<table class="center">
<tr><td>Gym Shoe Id</td><td><input type="text" name="gshoeid"></td></tr> 
<tr height="20px"></tr>
<tr><td><input type="submit" value="Gym Shoe Delete"></td></tr>
</table>
</form>
<br>
<br>
<br>
<div class="container">
<a href="GymShoesDisplaybu.jsp">View all the Gym Shoes here</a>
</div>
</body>
</html>