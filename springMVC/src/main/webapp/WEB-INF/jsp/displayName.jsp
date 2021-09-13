<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "mysql.SDetailsDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Display Name</title>
</head>

<body>

<%
 SDetailsDTO name = (SDetailsDTO)request.getAttribute("name");
 <p>SID : <c:out value="${name.getSid()}"/></p>
  <p>Fname : <c:out value="${name.getFname()}"/></p>
  <p>Lname : <c:out value="${name.getLname()}"/></p>
  <p>DOB : <c:out value="${name.getDob()}"/></p>
  <p>Address : <c:out value="${name.getAddress()}"/></p>
%>


</body>

</html>