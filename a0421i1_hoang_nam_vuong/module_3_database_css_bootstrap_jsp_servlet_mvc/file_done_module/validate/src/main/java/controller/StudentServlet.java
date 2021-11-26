package controller;

import model.bean.Student;
import model.service.StudentService;
import model.service.impl.StudentServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "StudentServlet",urlPatterns = {"/student"})
public class StudentServlet extends HttpServlet {
    StudentService studentService = new StudentServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "add":
                saveStudent(request,response);
                //thêm
                break;
            case "edit":
                updateStudent(request,response);
                break;
            case "delete":
                showDeleteStudentForm(request,response);
                // xóa
                break;
            default:
                break;
        }

    }

    private void showDeleteStudentForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        if (studentService.delete(id)){
            request.setAttribute("mess", "delete thành công");
        }else {
            request.setAttribute("mess", "delete thất bại");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/list.jsp");
        request.setAttribute("studentList",studentService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateStudent(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int classId = Integer.parseInt(request.getParameter("classId"));
        int point = Integer.parseInt(request.getParameter("point"));
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String email = request.getParameter("email");
        String account = request.getParameter("account");
        Student student =new Student(id,name,birthday,classId,point,gender,account,email);
        boolean check= studentService.update(id,student);
        if (check){
            request.setAttribute("mess", "update thành công");
        }else {
            request.setAttribute("mess", "update thất bại");
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/list.jsp");
        request.setAttribute("studentList",studentService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveStudent(HttpServletRequest request, HttpServletResponse response) {

        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        int classId = Integer.parseInt(request.getParameter("classId"));
        int point = Integer.parseInt(request.getParameter("point"));
        boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
        String email = request.getParameter("email");
        String account = request.getParameter("account");
        Student student =new Student(name,birthday,classId,point,gender,account,email);

//        boolean check= studentService.save(student);
        Map<String,String> map = studentService.save1(student);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/list.jsp");
        RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("view/student/create.jsp");
        if (map.isEmpty()){
            try {
                request.setAttribute("studentList",studentService.findAll());
                request.setAttribute("mess","Thêm mới thành công");
                requestDispatcher.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                // tra ve rang create + đưa dl của student + message lỗi
                request.setAttribute("emailMss",map.get("emailMss"));
                request.setAttribute("oldStudent",student);
                requestDispatcher1.forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action==null){
            action ="";
        }
        switch (action){
            case "add":
                showCreateStudentForm(request,response);
                //thêm
                break;
            case "edit":
                showEditStudentForm(request,response);
                // sửa
                break;
            case "delete":
                System.out.println("delete");
//                showDeleteStudentForm(request,response);
                // xóa
                break;
            default:
                showStudentList(request,response);
                break;
        }
//
    }

    private void showEditStudentForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Student student =studentService.findById(id);
        request.setAttribute("student",student);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/edit.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void showCreateStudentForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showStudentList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/student/list.jsp");
        request.setAttribute("studentList",studentService.findAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
