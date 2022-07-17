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
</head>
<body>
<h1 align="center">Trekking Shoes Insert</h1>

<form action="TrekkingInsert">
<table class="center">
<tr><td>Trekking Shoe Id</td><td><input type="text" name="tshoeid"></td></tr> 
<tr><td>Trekking Shoe Name</td><td><input type="text" name="tshoename"></td></tr>
<tr><td>Trekking Shoe Size</td><td>
<select name="tsize">
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>

</select></td></tr>
<tr><td>Trekking Shoe Price</td><td><input type="text" name="tshoeprice"></td></tr>
<tr height="20px"></tr>
<tr><td><input type="submit" value="Trekking Shoe Insert"></td></tr>
</table>
</form>

<br><br><br>
<div class="container">
<a href="TrekkingDisplaybu.jsp">View all the Trekking Shoes here</a>
</div>

</body>
</html>