<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.*" %>
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

</style>
</head>
<body>
<h1 align="center">List of Gym Shoes</h1>
<div style="text-align:center">
<%List<GymShoesPOJO> list= (List<GymShoesPOJO>)request.getAttribute("list");%>
<table class="center" border="1">
<tr>
<th>Shoe Id</th>
<th>Shoe Name</th>
<th>Shoe Size</th>
<th>Shoe Price</th>
<th>Edit Shoe</th>
<th>Delete Shoe</th>
</tr>
<%for(GymShoesPOJO g:list){ %>

<tr>
<td><%=g.getGshoeid() %></td>
<td><%=g.getGshoename() %></td>
<td><%=g.getGshoesize() %></td>
<td><%=g.getGshoeprice() %></td>
<td><a href="GymShoesUpdate.jsp">Update Shoe Details</a></td>
<td><a href="GymShoesDelete.jsp">Delete Shoe Details</a></td>
</tr>
<%} %>
</table>

<br><br><br>

<a href="GymShoesInsert.jsp">Insert a new shoe</a>
</div>
</body>

</html>