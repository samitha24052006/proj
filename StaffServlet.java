package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.DBConnection;

public class StaffServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String action = req.getParameter("action");
        String id = req.getParameter("id");

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE requests SET status=? WHERE id=?");

            ps.setString(1, action.equals("approve") ? "Approved" : "Rejected");
            ps.setString(2, id);
            ps.executeUpdate();

            res.sendRedirect("staffDashboard.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
