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

margin-top: 15px;
}

</style>
</head>
<body>
<div class="al">
<h1 align="center">Running shoes insert</h1>
<form action="RunInsert">
<table class="center">
<tr><td>Shoe Id</td><td><input type="text" name="shoeid"></td></tr>
<tr><td>Shoe name</td><td><input type="text" name="shoename"></td></tr>
<tr><td>Shoe Size</td><td><select name="shoesize">
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>

</select></td></tr>
<tr><td>Shoe price</td><td><input type="text" name="shoeprice"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="Submit" value="Insert"></td></tr>
</table>
</form>

<br>
<br>
<br>
<div class="container">
<a href="RunningShoesDisplaybu.jsp">View all the Running shoes here</a>
</div>
</div>
</body>
</html>