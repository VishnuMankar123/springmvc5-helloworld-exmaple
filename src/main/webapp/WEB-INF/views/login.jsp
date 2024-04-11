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
<!-- Write some code to handle the invalild login scinario -->

<c:if test="${param.error!=null}">
    <i style="color: red">Invalid login or password</i>
</c:if>

<c:if test="${param.logout!=null}">
    <i style="color: green">Successfully Logout</i>
</c:if>


<h1>My Custom Login Page</h1>
<form:form action="process-login" method="post">
UserName: <input type="text" name="username" placeholder="Enter your Name !!"><br/><br>
    Password: <input type="password" name="password" placeholder="Enter your Password here !!"><br/><br/>
    <input type="submit" value="Login">
</form:form>
</body>
</html>