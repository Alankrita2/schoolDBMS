<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

 <form action = "/student/insert/">
 <p>SID : <input type="text" name = "sid" value="${name.getSid()}"/></p>
 <p>Fname : <input type="text" name = "sid" t value="${name.getFname()}"/></p>
 <p>Lname : <input type="text" name = "sid"  value="${name.getLname()}"/></p>
 <p>DOB : <input type="text" name = "sid"  value="${name.getDob()}"/></p>
 <p>Address : <input type="text" name = "sid"  value="${name.getAddress()}"/></p>
 <p><input type = "submit" value = "Insert"></p>
 </form>
%>

<h2> <c:out value="${msg}"/><h2>

</body>

</html>