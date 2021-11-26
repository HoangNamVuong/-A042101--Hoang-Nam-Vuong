<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 10/29/2021
  Time: 2:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/jquery/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" href="/bootstrap-4.6.0-dist/css/bootstrap.min.css">
    <script src="/bootstrap-4.6.0-dist/js/bootstrap.min.js"></script>
    <script src="/bootstrap-4.6.0-dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap.min.css">
    <script src="/datatables/js/jquery.dataTables.min.js"></script>
    <script src="/datatables/js/dataTables.bootstrap4.min.js"></script>
    <%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">--%>
    <%--    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>--%>
    <%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>--%>
</head>
<body>
<h1>List TComplex</h1>
<form action="/product?action=search" method="post">
    <input type="text" name="ten" placeholder="nhap ten">
    <select name="idDanhMuc"  placeholder="nhap danh muc">
        <option value="">--chon danh muc-</option>
        <c:forEach items="${danhMucList}" var="danhMuc">
            <option value="${danhMuc.idDanhMuc}">${danhMuc.tenDanhMuc}</option>
        </c:forEach>
    </select>
    <button type="submit">Search</button>
</form>
<a href="product?action=add"> Add</a>

<c:if test="${mess!=null}">
    <strong style="color: red">${mess}</strong>
</c:if>
<table  class="table table-active" id="idPhanTrang">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">ID</th>
        <th scope="col">TEN</th>
        <th scope="col">SO LUONG</th>
        <th scope="col"> MAU SAC</th>
        <th scope="col">MO TA</th>
        <th scope="col"> DANH MUC</th>
        <th scope="col">Tac Vu</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${product.idSanPham}</td>
            <td>${product.ten}</td>
            <td>${product.gia}</td>
            <td>${product.soLuong}</td>
            <td>${product.mauSac}</td>
            <td>${product.moTa}</td>
            <td>
                <c:forEach items="${danhMucList}" var="danhMuc">
                    <c:if test="${danhMuc.idDanhMuc==trangThai.idDanhMuc}">
                        <span>${trangThai.kieuTrangThai}</span>
                    </c:if>
                </c:forEach>
            </td>

                <%--            <td><a href="/tComplex?action=edit&idMatBang=${tComplex.idMatBang}">Edit</a></td>--%>
                <%--            <td><a href="/tComplex?action=delete&idMatBang=${tComplex.idMatBang}">Delete</a></td>--%>
            <td>
                <a href="/tComplex?action=edit&idMatBang=${product.idSanPham}">Edit</a>
                <button type="button"  class="btn btn-danger" onclick="duaDuLieuLenModal('${product.idSanPham}')"
                        data-toggle="modal" data-target="#exampleModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <form action="/product?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Hộp thoại xác nhận xóa</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input id="idSanPhamg" hidden name="idSanPham">
                    <span>Bạn có muốn xóa mat bang </span>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">OK</button>
                </div>
            </div>
        </form>
    </div>
</div>
<script>
    function duaDuLieuLenModal(idMatBang) {
        document.getElementById("idSanPham").value =idSanPham;
    }
</script>
<script>
    $(document).ready(function () {
        $('#idPhanTrang').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 4
        })
    })
</script>
</body>
</html>
