<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
import="ex.Employee" %>
   <%

Employee emp = new Employee("0001", "みなと");
   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<p>IDは<%= emp.getId() %>名前は<%= emp.getName()%>です</p>
</body>
</html>