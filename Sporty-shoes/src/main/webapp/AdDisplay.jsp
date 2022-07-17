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
<h1 align="center">List of administrators</h1>
<div style="text-align:center">
<%List<Admin> list=(List<Admin>)request.getAttribute("list"); %>
<table class="center" border="1">
<tr>
<th>AdminId</th>
<th>AdminName</th>
<th>AdminPassword</th>
<th>UpdateAdmin</th>
<th>DeleteAdmin</th>
</tr>

<%for(Admin b:list){ %>

<tr>
<td><%=b.getAdmid() %></td>
<td><%=b.getAdmname() %></td>
<td><%=b.getAdmpassword() %></td>
<td><a href="AdUpdate.jsp">UpdateAdmin</a>
<td><a href="AdDelete.jsp">DeleteAdmin</a>
</tr>
<%} %>

</table>

<br>
<br>
<br>

<a href="AdRegister.jsp">Insert a new admin</a>
</div>

</body>
</html>