package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.DBConnection;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String role = req.getParameter("role");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users WHERE email=? AND password=? AND role=?");
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, role);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("email", email);
                session.setAttribute("role", role);

                switch (role) {
                    case "student":
                        res.sendRedirect("studentDashboard.jsp");
                        break;
                    case "team":
                        res.sendRedirect("teamDashboard.jsp");
                        break;
                    case "staff":
                        res.sendRedirect("staffDashboard.jsp");
                        break;
                    case "admin":
                        res.sendRedirect("adminDashboard.jsp");
                        break;
                }

            } else {
                res.sendRedirect("login.jsp?error=Invalid Credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
