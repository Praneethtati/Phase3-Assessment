<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.example.demo.*" %>
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
<h1 align="center">List of Users</h1>
<div style="text-align:center">
<%List<Users> list=(List<Users>)request.getAttribute("list"); %>
<table class="center" border="1">
<tr>
<th>User ID</th>
<th>User Name</th>
<th>Password</th>
<th>Update User</th>
<th>Delete User</th>
</tr>

<%for(Users u:list){ %>

<tr>
<td><%=u.getUserid()%></td>
<td><%=u.getUsername() %></td>
<td><%=u.getPassword() %></td>
<td><a href="UserUpdate.jsp">Edit User Details</a></td>
<td><a href="UserDelete.jsp">Delete User</a></td>
</tr>
<%} %>


</table>
<br>
<br>
<br>

<a href="Register.jsp">Insert a new user</a>
</div>


</body>
</html>