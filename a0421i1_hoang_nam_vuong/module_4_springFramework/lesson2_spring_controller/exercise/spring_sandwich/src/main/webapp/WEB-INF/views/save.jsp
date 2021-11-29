<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/29/2021
  Time: 9:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Condiment</title>
</head>
<body>
<c:forEach items="${condiment}" var="eat">
    <h1>${eat}</h1>
</c:forEach>
</body>
</html>
