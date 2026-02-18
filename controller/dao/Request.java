package model;

import java.util.Date;

public class Request {

    private int id;
    private int studentId;
    private int teamId;   // if individual student = 0
    private String component;
    private String status; // Pending, Approved, Rejected
    private Date requestDate;

    private int staffId; // assigned

    public Request() {}

    public Request(int id, int studentId, int teamId,
                   String component, String status,
                   Date requestDate, int staffId) {

        this.id = id;
        this.studentId = studentId;
        this.teamId = teamId;
        this.component = component;
        this.status = status;
        this.requestDate = requestDate;
        this.staffId = staffId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getTeamId() { return teamId; }
    public void setTeamId(int teamId) { this.teamId = teamId; }

    public String getComponent() { return component; }
    public void setComponent(String component) { this.component = component; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getRequestDate() { return requestDate; }
    public void setRequestDate(Date requestDate) { this.requestDate = requestDate; }

    public int getStaffId() { return staffId; }
    public void setStaffId(int staffId) { this.staffId = staffId; }
}
