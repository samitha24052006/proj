package model;

public class Student {

    private int id;
    private String name;
    private String rollNo;
    private String email;
    private String password;

    private int teamId;  // optional if individual = 0

    public Student() {}

    public Student(int id, String name, String rollNo, String email, String password, int teamId) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.email = email;
        this.password = password;
        this.teamId = teamId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getTeamId() { return teamId; }
    public void setTeamId(int teamId) { this.teamId = teamId; }
}
