package controller;

import model.bean.DanhMuc;
import model.bean.Product;
import model.service.DanhMucService;
import model.service.ProductService;
import model.service.imp.DanhMucServiceImpl;
import model.service.imp.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    private DanhMucService danhMucService = new DanhMucServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "add":
                showCreateProductForm(request,response);
                break;
            case "edit":
                showEditProductForm(request,response);
                break;
            case "delete":
//                showDeleteProductForm(request,response);
                break;
            default:
                showProductList(request,response);
                break;
        }
    }

    private void showEditProductForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idSanPham"));
        Product product = productService.findById(id);
        List<Product> productList = productService.findAll();
        List<DanhMuc> danhMucList = danhMucService.findByAll();
        request.setAttribute("productList",productList);
        request.setAttribute("danhMucList",danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/edit.jsp");
        try {
            if (product==null){
                response.sendRedirect("view/error-404.jsp");
            }else {
                requestDispatcher.forward(request,response);
            }
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateProductForm(HttpServletRequest request, HttpServletResponse response) {
        List<DanhMuc> danhMucList = danhMucService.findByAll();
        request.setAttribute("danhMucList",danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = productService.findAll();
        List<DanhMuc> danhMucList = danhMucService.findByAll();
        request.setAttribute("productList",productList);
        request.setAttribute("danhMucList",danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action) {
            case "add":
                saveNewProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            default:
                showProductList(request, response);
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("ten");
        String idDanhMuc = request.getParameter("idDanhMuc");
        List<Product> productList = new ArrayList<>();
        productList =productService.search(ten,idDanhMuc);
        List<DanhMuc> danhMucList = danhMucService.findByAll();
        request.setAttribute("danhMucList",danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        if (productList.size()!=0){
            request.setAttribute("productList",productList);
        }else {
            request.setAttribute("mess","khong co du lieu duoc tim thay");
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idSanPham"));
        boolean check =productService.delete(id);
        if (check){
            request.setAttribute("mess","xoa thanh cong");
        }else {
            request.setAttribute("mess","xoa khong thanh cong");
        }
        showProductList(request,response);
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idSanPham"));
        String ten = request.getParameter("ten");
        String gia = request.getParameter("gia");
        String soLuong = request.getParameter("so_luong");
        String mauSac = request.getParameter("mau_sac");
        String moTa = request.getParameter("mo_ta");
        int idDanhMuc = Integer.parseInt(request.getParameter("id_danh_muc"));
        Product product = new Product(ten, gia, soLuong, mauSac, moTa, idDanhMuc);
        boolean check =productService.update(id,product);
        if (check){
            request.setAttribute("mess","Edit thanh cong");
        }else {
            request.setAttribute("mess","Edit  khong thanh cong");
        }
        List<Product> productList = productService.findAll();
        List<DanhMuc> danhMucList = danhMucService.findByAll();
        request.setAttribute("productList",productList);
        request.setAttribute("danhMucList",danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveNewProduct(HttpServletRequest request, HttpServletResponse response) {
        String ten = request.getParameter("ten");
        String gia = request.getParameter("gia");
        String soLuong = request.getParameter("so_luong");
        String mauSac = request.getParameter("mau_sac");
        String moTa = request.getParameter("mo_ta");
        int idDanhMuc = Integer.parseInt(request.getParameter("id_danh_muc"));
        Product product = new Product(ten, gia, soLuong, mauSac, moTa, idDanhMuc);
        boolean check =productService.save(product);
        if (check){
            request.setAttribute("mess","Them moi thanh cong");
        }else {
            request.setAttribute("mess","Them moi không thanh cong");
        }
        List<Product> productList = productService.findAll();
        List<DanhMuc> danhMucList = danhMucService.findByAll();
        request.setAttribute("productList",productList);
        request.setAttribute("danhMucList",danhMucList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/product/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
