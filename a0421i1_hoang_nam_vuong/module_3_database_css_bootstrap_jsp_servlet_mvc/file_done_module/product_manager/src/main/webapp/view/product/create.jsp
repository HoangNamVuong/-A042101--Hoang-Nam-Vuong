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
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap.min.css">
    <script src="/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/datatables/js/dataTables.bootstrap4.min.js"></script>
</head>
<body>
<h1>Create TComplex</h1>
<form action="/tComplex?action=add" method="post">
    ID <input type="text" hidden name="idSanPham"><br>
    TEN <input type="text" name="maMatBang"><br>
    GIA <input type="text" name="dienTich"><br>
    SO LUONG <input type="text" name="dienTich"><br>
    MAU SAC <input type="text" name="dienTich"><br>
    MO TA <input type="text" name="dienTich"><br>
    DANH MUC <select name="idTrangThai">
                    <c:forEach items="${trangThaiList}" var="trangThai">
                        <option value="${trangThai.idTrangThai}">${trangThai.kieuTrangThai}</option>
                    </c:forEach>
                </select><br>
    <button type="submit">Add</button>
</form>

<%--<div class="container-fluid">--%>
<%--    <div class="row bg-white p-lg-5">--%>
<%--        <div class="col-lg-12">--%>
<%--            <h3 class="text-center">Thêm mat bang</h3>--%>
<%--            <form action="/tComplex?action=add" method="post">--%>
<%--                <div class="form-group">--%>
<%--                    <label for="idMatBang">ID</label>--%>
<%--                     <input class="form-control" type="text" hidden name="idMatBang" id="idMatBang" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="maMatBang">Ma MB</label>--%>
<%--                    <input class="form-control" type="text" name="maMatBang" id="maMatBang"  value="${oldTComplex.maMatBang}" required>--%>
<%--                    <span>${messMaMatBang}</span>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="dienTich">Dien Tich</label>--%>
<%--                    <input class="form-control" type="text" name="dienTich" id="dienTich" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="idTrangThai">Trang Thai</label>--%>
<%--                    <select class="form-control" name="idTrangThai"  id="idTrangThai" required>--%>
<%--                        <c:forEach items="${trangThaiList}" var="trangThai">--%>
<%--                            <option value="${trangThai.idTrangThai}">${trangThai.kieuTrangThai}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="idSoTang">So Tang</label>--%>
<%--                    <select class="form-control" name="idSoTang"  id="idSoTang" required>--%>
<%--                        <c:forEach items="${soTangList}" var="soTang">--%>
<%--                            <option value="${soTang.idSoTang}">${soTang.tenTang}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="idLoaiMatBang">Loai MB</label>--%>
<%--                    <select class="form-control" name="idLoaiMatBang"  id="idLoaiMatBang" required>--%>
<%--                        <c:forEach items="${loaiMatBangList}" var="loaiMatBang">--%>
<%--                            <option value="${loaiMatBang.idLoaiMatBang}">${loaiMatBang.kieuMatBang}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="giaTien">Gia Tien</label>--%>
<%--                    <input class="form-control" type="text" name="giaTien" id="giaTien" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="ngayBatDau">Ngay Bat Dau</label>--%>
<%--                    <input class="form-control" type="date" name="ngayBatDau" id="ngayBatDau" value="${oldTComplex.ngayBatDau}" required>--%>
<%--                </div>--%>
<%--                <div class="form-group">--%>
<%--                    <label for="ngayKetThuc"> Ngay Ket Thuc</label>--%>
<%--                    <input class="form-control" type="date" name="ngayKetThuc" id="ngayKetThuc"required>--%>
<%--                </div>--%>
<%--                <button type="submit" class="btn btn-primary">Lưu</button>--%>
<%--                <button type="button" class="btn btn-success">--%>
<%--                    <a href="/tComplex" class="text-white">Quay Lại</a>--%>
<%--                </button>--%>
<%--            </form>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
</html>
