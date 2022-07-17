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
<h1 align="center">List of trekking shoes</h1>
<div style="text-align:center">
<%List<Trekking> list= (List<Trekking>)request.getAttribute("list");%>
<table class="center" border="1">
<tr>
<th>Shoe Id</th>
<th>Shoe Name</th>
<th>Shoe Size</th>
<th>Shoe Price</th>
<th>Edit Shoe</th>
<th>Delete Shoe</th>
</tr>
<%for(Trekking t:list){ %>

<tr>
<td><%=t.getTshoeid() %></td>
<td><%=t.getTshoename() %></td>
<td><%=t.getTshoesize() %></td>
<td><%=t.getTshoeprice() %></td>
<td><a href="TrekkingUpdate.jsp">Update Shoe Details</a></td>
<td><a href="TrekkingDelete.jsp">Delete Shoe Details</a></td>
</tr>
<%} %>
</table>

<br><br><br>

<a href="TrekkingInsert.jsp">Insert a new shoe</a>
</div>
</body>

</html>