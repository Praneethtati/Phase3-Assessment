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
<h1 align="center">Mountaineering Shoes Delete</h1>

<form action="MountaineeringDelete">
<table class="center">
<tr><td>Mountaineering Shoe Id</td><td><input type="text" name="mshoeid"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit" value="Mountaineering shoe delete"></td></tr>
</table>
</form>
<br>
<br>
<br>
<div class="container">
<a href="MountaineeringDisplaybu.jsp">View all the Mountaineering Shoes here</a>
</div>
</body>
</html>