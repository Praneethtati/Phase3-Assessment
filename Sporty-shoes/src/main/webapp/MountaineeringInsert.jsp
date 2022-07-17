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
<h1 align="center">Mountaineering Shoes Insert</h1>

<form action="MountaineeringInsert">
<table class="center">
<tr><td>Mountaineering Shoe Id</td><td><input type="text" name="mshoeid"></td></tr> 
<tr><td>Mountaineering Shoe Name</td><td><input type="text" name="mshoename"></td></tr>
<tr><td>Mountaineering Shoe Size</td><td>
<select name="mshoesize">
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>

</select></td></tr>
<tr><td>Mountaineering Shoe Price</td><td><input type="text" name="mshoeprice"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit" value="Mountaineering Shoe Insert"></td></tr>
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