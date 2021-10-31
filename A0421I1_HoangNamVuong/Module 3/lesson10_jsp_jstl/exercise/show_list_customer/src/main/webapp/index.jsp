<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/30/2021
  Time: 12:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<%--  <jsp:forward page="views/home.jsp"></jsp:forward>--%>
<%--Chuyển trang--%>
<c:redirect url="/list"></c:redirect>
<h1>Trang index</h1>
</body>
</html>