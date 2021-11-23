package servelet;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletCustomer", urlPatterns = "/list")
public class ServletCustomer extends HttpServlet {
    List<Customer> customerList = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        customerList.add(new Customer("Mai Van Hoan", "1/2/2020","da nang"));
        customerList.add(new Customer("Nguyen Van Nam", "1/3/2000","da nang"));
        customerList.add(new Customer("Nguyen Dinh Thi", "15/2/1990","ha noi"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", customerList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/home.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    public void destroy() {
        System.out.println("delete");
    }
}
