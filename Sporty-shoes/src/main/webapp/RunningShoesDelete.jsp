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

.al{

margin-top: 70px;
}

</style>
</head>
<body>
<div class="al">
<h1 align="center">Running shoes delete</h1>
<form action="RunDelete">
<table class="center">
<tr><td>Shoe Id</td><td><input type="text" name="shoeid"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit" value="delete"></td></tr>
</table>
</form>
<div class="container">
<h2><a href="RunningShoesDisplaybu.jsp">View the running shoes</a></h2>
</div>
</div>
</body>
</html>