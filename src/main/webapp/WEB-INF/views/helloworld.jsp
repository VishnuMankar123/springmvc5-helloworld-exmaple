<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring 5 MVC - Hello World Example | javaguides.net</title>
</head>
<body>
<%--	<h2>${helloWorld.message}</h2>--%>
<%--	<h4>Server date time is : ${helloWorld.dateTime}</h4>--%>

<form:form action="logout" method="post">

	<input type="submit" value="logout" />
</form:form>
</body>
</html>