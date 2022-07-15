<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="gray">
<h1>Welcome to home</h1>
<br><br><br><br>
<div>
<form action="" method="post">
<label>Enter Email</label>
<input type="email" name="email" required="required"><br>
<label>Enter Password</label>
<input type="password" name="pass" required="required"><br>
<input type="submit" value="Login">
</form>
<label><a href="Register.jsp">Register</a>If user not register.</label>
</div><br>


</body>
</html>