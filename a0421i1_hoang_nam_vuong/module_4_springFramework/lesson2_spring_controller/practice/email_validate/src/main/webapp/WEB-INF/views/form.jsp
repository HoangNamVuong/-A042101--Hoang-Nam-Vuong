<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/28/2021
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validation</title>
</head>
<body>
<h1>Email Validation</h1>
<h3>${message}</h3>
<form action="validate" method="post">
    <input type="text" name="email"><br>
    <input type="submit" name="validate" value="Validate">
</form>
</body>
</html>
