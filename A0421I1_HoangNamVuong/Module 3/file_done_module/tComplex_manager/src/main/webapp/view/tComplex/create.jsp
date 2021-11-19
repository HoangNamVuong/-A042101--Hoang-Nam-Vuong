<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/29/2021
  Time: 2:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/jquery/jquery-3.6.0.min.js"></script>
    <link type="text/css" href="/bootstrap-4.6.0-dist/css/bootstrap.css">
    <script src="/bootstrap-4.6.0-dist/js/bootstrap.js"></script>
</head>
<body>
<h1>Create TComplex</h1>
<form action="/tComplex?action=add" method="post">
    ID      <input type="text" hidden name="idMatBang"><br>
    Ma MB      <input type="text" name="maMatBang"><br>
    Dien Tich      <input type="text" name="dienTich"><br>
<%--    Trang Thai    <input type="text" name="idTrangThai"><br>--%>
    Trang Thai      <select name="idTrangThai">
                <c:forEach items="${trangThaiList}" var="trangThai">
                   <option value="${trangThai.idTrangThai}">${trangThai.kieuTrangThai}</option>
                </c:forEach>
</select><br>
    So Tang      <input type="text" name="idSoTang"><br>
    Loai MB    <input type="text" name="idLoaiMatBang"><br>
    Gia Tien     <input type="text" name="giaTien"><br>
    Ngay Bat Dau  <input type="date" name="ngayBatDau"><br>
    Ngay Ket Thuc  <input type="date" name="ngayKetThuc"><br>
    <button type="submit">Add</button>
</form>
</body>
</html>
