import Minites.Student.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")

public class StudentServlet extends HttpServlet {
    StudentServlet studentServlet = new StudentServlet();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String add = request.getParameter("add.jsp");
        if (add == null) {
            add = "";
        }
        switch (add) {
            default:
                ShowlistPage(request, response);
        }
    }

    private void ShowlistPage(HttpServletRequest request, HttpServletResponse response) {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Student/list.jsp");
        List<Student> studentList = studentServlet.findAll();

    }
}
