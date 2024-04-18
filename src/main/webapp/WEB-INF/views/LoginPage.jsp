<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h2>Login Page</h2>
    <form action="userLogin", method="post">
        <pre>
            Email            <input type="text" name="email">
            Password         <input type="password" name="password">
            <button type="Submit">Login</button>
        </pre>
</form>
${error}
</body>
</html>