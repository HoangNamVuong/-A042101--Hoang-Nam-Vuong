package controller;

import model.bean.TComplex;
import model.bean.TrangThai;
import service.TComplexService;
import service.TrangThaiService;
import service.impl.TComplexServiceImpl;
import service.impl.TrangThaiServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "TComplexServlet", value = "/tComplex")
public class TComplexServlet extends HttpServlet {
    private TComplexService tComplexService = new TComplexServiceImpl();
    private TrangThaiService trangThaiService = new TrangThaiServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "add":
                showCreateTComplexForm(request,response);
                break;
            case "edit":
                showEditTComplexForm(request,response);
                break;
            case "delete":
                showDeleteTComplexForm(request,response);
                break;
            default:
                showTComplexList(request,response);
                break;
        }
    }

    private void showTComplexList(HttpServletRequest request, HttpServletResponse response) {
        List<TComplex> tComplexList = tComplexService.findAll();
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        request.setAttribute("tComplexList",tComplexList);
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateTComplexForm(HttpServletRequest request, HttpServletResponse response) {
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditTComplexForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idMatBang"));
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        TComplex tComplex = tComplexService.findById(id);
        request.setAttribute("tComplex",tComplex);
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/edit.jsp");
        try {
            if (tComplex==null){
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

    private void showDeleteTComplexForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idMatBang"));
        TComplex tComplex = tComplexService.findById(id);
        request.setAttribute("tComplex",tComplex);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/delete.jsp");
        try {
            if (tComplex==null){
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


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action) {
            case "add":
                saveNewTComplex(request,response);
                break;
            case "edit":
                editTComplex(request,response);
                break;
            case "delete":
                deleteTComplex(request,response);
                break;
            case "search":
                searchTComplex(request,response);
                break;
            default:
                showTComplexList(request, response);
                break;
        }
    }

    private void saveNewTComplex(HttpServletRequest request, HttpServletResponse response) {
        String maMatBang = request.getParameter("maMatBang");
        String dienTich = request.getParameter("dienTich");
        int idTrangThai = Integer.parseInt(request.getParameter("idTrangThai"));
        int idSoTang = Integer.parseInt(request.getParameter("idSoTang"));
        int idLoaiMatBang = Integer.parseInt(request.getParameter("idLoaiMatBang"));
        String giaTien = request.getParameter("giaTien");
        String ngayBatDau = request.getParameter("ngayBatDau");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        TComplex tComplex =new TComplex(maMatBang,dienTich,idTrangThai,idSoTang,idLoaiMatBang,giaTien,ngayBatDau,ngayKetThuc);
        boolean check =tComplexService.save(tComplex);
        if (check){
            request.setAttribute("mess","Them moi thanh cong");
        }else {
            request.setAttribute("mess","Them moi không thanh cong");
        }
        List<TComplex> tComplexList = tComplexService.findAll();
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        request.setAttribute("tComplexList",tComplexList);
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editTComplex(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idMatBang"));
        String maMatBang = request.getParameter("maMatBang");
        String dienTich = request.getParameter("dienTich");
        int idTrangThai = Integer.parseInt(request.getParameter("idTrangThai"));
        int idSoTang = Integer.parseInt(request.getParameter("idSoTang"));
        int idLoaiMatBang = Integer.parseInt(request.getParameter("idLoaiMatBang"));
        String giaTien = request.getParameter("giaTien");
        String ngayBatDau = request.getParameter("ngayBatDau");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        TComplex tComplex =new TComplex(maMatBang,dienTich,idTrangThai,idSoTang,idLoaiMatBang,giaTien,ngayBatDau,ngayKetThuc);
        tComplex.setIdMatBang(id);
        boolean check =tComplexService.save(tComplex);
        if (check){
            request.setAttribute("mess","Edit thanh cong");
        }else {
            request.setAttribute("mess","Edit  không thanh cong");
        }
        List<TComplex> tComplexList = tComplexService.findAll();
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        request.setAttribute("tComplexList",tComplexList);
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteTComplex(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idMatBang"));
        boolean check =tComplexService.delete(id);
        if (check){
            request.setAttribute("mess","Xóa thanh cong");
        }else {
            request.setAttribute("mess","Xóa không thanh cong");
        }
        List<TComplex> tComplexList = tComplexService.findAll();
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        request.setAttribute("tComplexList",tComplexList);
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchTComplex(HttpServletRequest request, HttpServletResponse response) {
        String idLoaiMatBang = request.getParameter("idLoaiMatBang");
        String giaTien = request.getParameter("giaTien");
        String idSoTang = request.getParameter("idSoTang");
        List<TComplex> tComplexList =new ArrayList<>();
        tComplexList =tComplexService.search(idLoaiMatBang,giaTien,idSoTang);
        List<TrangThai> trangThaiList = trangThaiService.findByAll();
        request.setAttribute("trangThaiList",trangThaiList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/tComplex/list.jsp");
        if (tComplexList.size()!=0){
            request.setAttribute("tComplexList",tComplexList);
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

}
