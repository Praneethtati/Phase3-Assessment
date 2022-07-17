<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.RunningShoesController" %>
     <%@ page import="com.example.demo.RunningShoesDAO" %>
     <%@ page import="com.example.demo.RunningShoesPOJO" %>
     <%@ page import="com.example.demo.RunningShoesRepository" %>
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
<h1 align="center">List of Running Shoes</h1>
<%List<RunningShoesPOJO> list= (List<RunningShoesPOJO>)request.getAttribute("list");%>
<table class="center" border="1">
<tr>
<th>Shoe Id</th>
<th>Shoe Name</th>
<th>Shoe Size</th>
<th>Shoe Price</th>
<th>Update Shoe</th>
<th>Delete Shoe</th>
</tr>
<%for(RunningShoesPOJO r:list){ %>
<tr>
<td><%=r.getShoeid() %></td>
<td><%=r.getShoename() %></td>
<td><%=r.getShoesize() %></td>
<td><%=r.getShoeprice() %></td>
<td><a href="RunningShoesUpdate.jsp">Update Shoe Details</a></td>
<td><a href="RunningShoesDelete.jsp">Delete Shoe Details</a></td>

</tr>
<%} %>



</table>
</body>
</html>