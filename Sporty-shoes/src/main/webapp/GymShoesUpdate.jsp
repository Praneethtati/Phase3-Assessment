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
<h1 align="center">Gym Shoes Update</h1>

<form action="GymUpdate">
<table class="center">
<tr><td>Gym Shoe Id</td><td><input type="text" name="gshoeid"></td></tr> 
<tr><td>Gym Shoe Name</td><td><input type="text" name="gshoename"></td></tr>
<tr><td>Gym Shoe Size</td><td><select name="gshoesize">
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>

</select></td></tr>
<tr><td>Gym Shoe Price</td><td><input type="text" name="gshoeprice"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit" value="Gym Shoe Update"></td></tr>
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