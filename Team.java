public class Team {
    
}
package model;

public class Team {

    private int id;
    private String teamId;
    private String teamName;
    private String leaderEmail;
    private String password;

    public Team() {}

    public Team(int id, String teamId, String teamName, String leaderEmail, String password) {
        this.id = id;
        this.teamId = teamId;
        this.teamName = teamName;
        this.leaderEmail = leaderEmail;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTeamId() { return teamId; }
    public void setTeamId(String teamId) { this.teamId = teamId; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getLeaderEmail() { return leaderEmail; }
    public void setLeaderEmail(String leaderEmail) { this.leaderEmail = leaderEmail; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamId='" + teamId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", leaderEmail='" + leaderEmail + '\'' +
                '}';
    }
}

