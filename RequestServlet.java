package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.DBConnection;

public class RequestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        HttpSession session = req.getSession();
        String email = (String) session.getAttribute("email");
        String role = (String) session.getAttribute("role");

        String component = req.getParameter("component");
        String quantity = req.getParameter("quantity");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO requests(requester_email, role, component, quantity, status) VALUES (?,?,?,?,?)");

            ps.setString(1, email);
            ps.setString(2, role);
            ps.setString(3, component);
            ps.setString(4, quantity);
            ps.setString(5, "Pending");
            ps.executeUpdate();

            if (role.equals("team")) {
                res.sendRedirect("teamDashboard.jsp");
            } else {
                res.sendRedirect("studentDashboard.jsp");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
