package users;

public class EmailNotificationUser implements IUser {
    private String username;
    private String email;

    public EmailNotificationUser(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(String channel, String message){
        System.out.println("To email: " + email);
        System.out.println(username + " received notification from " + channel + ": " + message);
    }
}
