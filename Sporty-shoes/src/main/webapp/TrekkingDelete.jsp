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
<h1 align="center">Trekking Shoes Delete</h1>
<form action="TrekkingDelete">
<table class="center">
<tr><td>Trekking Shoe Id</td><td><input type="text" name="tshoeid"></td></tr> 
<tr height="20px"></tr>
<tr><td><input type="submit" value="Trekking Shoe Delete"></td></tr>
</table>
</form>
<br>
<br>
<br>
<div class="container">
<a href="TrekkingDisplaybu.jsp">View all the Trekking Shoes here</a>
</div>
</body>
</html>