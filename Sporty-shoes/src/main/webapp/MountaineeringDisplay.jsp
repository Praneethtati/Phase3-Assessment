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
<div style="text-align:center">
<%List<Mountaineering> list=(List<Mountaineering>)request.getAttribute("list");%>

<table class="center" border="1">
<tr>
<th>Shoe Id</th>
<th>Shoe Name</th>
<th>Shoe Size</th>
<th>Shoe Price</th>
<th>Edit Shoe</th>
<th>Delete Shoe</th>
</tr>

<%for(Mountaineering m:list){ %>
<tr>
<td><%=m.getMshoeid() %></td>
<td><%=m.getMshoename() %></td>
<td><%=m.getMshoesize() %></td>
<td><%=m.getMshoeprice() %></td>
<td><a href="MountaineeringUpdate.jsp">Update Shoe Details</a></td>
<td><a href="MountaineeringDelete.jsp">Delete Shoe Details</a></td>

</tr>
<%} %>
</table>

<br><br><br>

<a href="MountaineeringInsert.jsp">Insert a new shoes</a>
</div>
</body>
</html>