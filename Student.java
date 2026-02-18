package model;

public class Student {

    private int id;
    private String name;
    private String roll;
    private String email;
    private String password;

    public Student() {}

    public Student(int id, String name, String roll, String email, String password) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRoll() { return roll; }
    public void setRoll(String roll) { this.roll = roll; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "Student{" + 
                "id=" + id +
                ", name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
