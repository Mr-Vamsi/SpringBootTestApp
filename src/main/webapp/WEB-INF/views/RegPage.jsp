<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
    <form action="saveReg", method="post">
        <pre>
            Name             <input type="text" name="name">
            Email            <input type="text" name="email">
            Phone            <input type="number" name="phone">
            Password         <input type="password" name="password">
            Confirm Password <input type="text" name="confirmpassword">
            <button type="Submit">Register</button>
        </pre>
</form>
</body>
</html>