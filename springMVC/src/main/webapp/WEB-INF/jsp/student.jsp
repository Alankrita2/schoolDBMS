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

 <form action = "/springMVC/student/insert/" method="post">
 <p>SID : <input type="text" name = "sid" /></p>
 <p>Fname : <input type="text" name = "sid" /></p>
 <p>Lname : <input type="text" name = "sid"  /></p>
 <p>DOB : <input type="text" name = "sid"  /></p>
 <p>Address : <input type="text" name = "sid"  "/></p>
 <p><input type = "submit" placeholder = "Insert" /></p>
 </form>
%>

<h2> <c:out value="${msg}"/><h2>

</body>

</html>