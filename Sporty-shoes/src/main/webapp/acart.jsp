<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.example.demo.*" %>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Cart</h1>
<%RunningShoesPOJO list=(RunningShoesPOJO)request.getAttribute("runningShoes");  %>
<center>
<table border="1" cellpadding = "10" cellspacing = "10" bordercolor = "red" bgcolor = "BlanchedAlmond" width="100%">
<tr>
<th>Item</th><th>Shoe name</th> <th>Price</th> <th>Size</th>
</tr>

<tr>
<td><%=list.getShoeid() %><td><%=list.getShoename() %></td> <td><%=list.getShoeprice()  %></td> <td><%=list.getShoesize()  %></td>
</tr>
</table>
</center>
</body>
</html>