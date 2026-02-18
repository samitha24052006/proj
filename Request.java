public class Request {
    
}
package model;

public class Request {

    private int id;
    private String requesterEmail;
    private String role;
    private String component;
    private int quantity;
    private String status;

    public Request() {}

    public Request(int id, String requesterEmail, String role, String component, int quantity, String status) {
        this.id = id;
        this.requesterEmail = requesterEmail;
        this.role = role;
        this.component = component;
        this.quantity = quantity;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getRequesterEmail() { return requesterEmail; }
    public void setRequesterEmail(String requesterEmail) { this.requesterEmail = requesterEmail; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getComponent() { return component; }
    public void setComponent(String component) { this.component = component; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", requesterEmail='" + requesterEmail + '\'' +
                ", role='" + role + '\'' +
                ", component='" + component + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
