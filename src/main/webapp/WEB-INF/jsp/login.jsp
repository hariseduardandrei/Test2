<%@ page isErrorPage="true" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
<head>
<title>Login Page</title>
</head>
<body>

<form action="login" method="POST">
<h3>Username:</h3>
<input type="text" name="username"/>
<h3>Password:</h3>
<input type="password" name="password"/><br/><br/>
${errorMessage}
<br/>
<input type="submit" value="Autentificare"/>

</form>
</body>
</html>