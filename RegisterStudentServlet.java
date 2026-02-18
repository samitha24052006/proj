package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.DBConnection;

public class RegisterStudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String roll = req.getParameter("roll");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Connection con = DBConnection.getConnection();
            
            PreparedStatement ps1 = con.prepareStatement(
                "INSERT INTO students(name, roll, email, password) VALUES (?,?,?,?)");
            ps1.setString(1, name);
            ps1.setString(2, roll);
            ps1.setString(3, email);
            ps1.setString(4, password);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(
                "INSERT INTO users(email, password, role) VALUES (?,?,?)");
            ps2.setString(1, email);
            ps2.setString(2, password);
            ps2.setString(3, "student");
            ps2.executeUpdate();

            res.sendRedirect("login.jsp?success=Student Registered");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
