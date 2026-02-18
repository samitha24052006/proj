package controller;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.DBConnection;

public class RegisterTeamServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String leader = req.getParameter("leaderEmail");
        String teamName = req.getParameter("teamName");
        String teamId = req.getParameter("teamId");
        String password = req.getParameter("password");

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement unique = con.prepareStatement(
                "SELECT * FROM teams WHERE team_id=?");
            unique.setString(1, teamId);
            ResultSet rs = unique.executeQuery();

            if (rs.next()) {
                res.sendRedirect("teamRegister.jsp?error=Team ID exists");
                return;
            }

            PreparedStatement ps1 = con.prepareStatement(
                "INSERT INTO teams(team_id, leader_email, team_name, password) VALUES (?,?,?,?)");
            ps1.setString(1, teamId);
            ps1.setString(2, leader);
            ps1.setString(3, teamName);
            ps1.setString(4, password);
            ps1.executeUpdate();

            PreparedStatement ps2 = con.prepareStatement(
                "INSERT INTO users(email, password, role) VALUES (?,?,?)");
            ps2.setString(1, leader);
            ps2.setString(2, password);
            ps2.setString(3, "team");
            ps2.executeUpdate();

            res.sendRedirect("login.jsp?success=Team Registered");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
