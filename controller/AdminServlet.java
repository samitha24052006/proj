public class AdminServlet {
    
}
package controller;

import dao.AdminDAO;
import dao.StudentDAO;
import dao.TeamDAO;
import dao.RequestDAO;
import dao.StaffDAO;

import model.Admin;
import model.Student;
import model.Team;
import model.Staff;
import model.Request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.List;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {

    private AdminDAO adminDAO;
    private StudentDAO studentDAO;
    private TeamDAO teamDAO;
    private RequestDAO requestDAO;
    private StaffDAO staffDAO;

    @Override
    public void init() throws ServletException {
        adminDAO = new AdminDAO();
        studentDAO = new StudentDAO();
        teamDAO = new TeamDAO();
        requestDAO = new RequestDAO();
        staffDAO = new StaffDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session == null || session.getAttribute("admin") == null) {
            resp.sendRedirect("adminLogin.jsp");
            return;
        }

        // fetch data for monitoring
        List<Student> students = studentDAO.getAllStudents();
        List<Team> teams = teamDAO.getAllTeams();
        List<Request> requests = requestDAO.getAllRequests();
        List<Staff> staff = staffDAO.getAllStaff();

        req.setAttribute("students", students);
        req.setAttribute("teams", teams);
        req.setAttribute("requests", requests);
        req.setAttribute("staff", staff);

        // forward to dashboard
        req.getRequestDispatcher("adminDashboard.jsp").forward(req, resp);
    }
}
