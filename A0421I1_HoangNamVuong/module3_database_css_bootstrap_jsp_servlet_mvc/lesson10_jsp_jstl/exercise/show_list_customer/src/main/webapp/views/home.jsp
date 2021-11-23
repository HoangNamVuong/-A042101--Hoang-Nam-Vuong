<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/30/2021
  Time: 12:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sach khach hang</h2>
<table>
    <tr>
        <th>name</th>
        <th>birthday</th>
        <th>address</th>
    </tr>
    <c:forEach items="${list}" var="customer" >
        <tr>
            <td>${customer.name}</td>
            <td><c:out value="${customer.birthday}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>