package model;

public class Team {

    private int id;
    private String teamName;
    private String leaderEmail;
    private String password;
    private int facultyId; // supervising faculty (incharge)

    public Team() {}

    public Team(int id, String teamName, String leaderEmail, String password, int facultyId) {
        this.id = id;
        this.teamName = teamName;
        this.leaderEmail = leaderEmail;
        this.password = password;
        this.facultyId = facultyId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getLeaderEmail() { return leaderEmail; }
    public void setLeaderEmail(String leaderEmail) { this.leaderEmail = leaderEmail; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getFacultyId() { return facultyId; }
    public void setFacultyId(int facultyId) { this.facultyId = facultyId; }
}
