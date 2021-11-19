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
<h1>Do you want Delete TComplex?</h1>
ID            <span>${tComplex.idMatBang}</span>
Ma MB         <span>${tComplex.maMatBang}</span>
Dien Tich     <span>${tComplex.dienTich}</span>
Trang Thai    <span>${tComplex.idTrangThai}</span>
So Tang       <span>${tComplex.idSoTang}</span>
Loai MB       <span>${tComplex.idLoaiMatBang}</span>
Gia Tien      <span>${tComplex.giaTien}</span>
Ngay Bat Dau   <span>${tComplex.ngayBatDau}</span>
Ngay Ket Thuc   <span>${tComplex.ngayKetThuc}</span>
<form action="/tComplex?action=delete&idMatBang=${tComplex.idMatBang}" method="post">
    <button type="submit">Delete</button>
</form>
</body>
</html>
