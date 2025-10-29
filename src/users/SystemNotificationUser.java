package users;

public class SystemNotificationUser implements IUser {
    private String username;

    public SystemNotificationUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void update(String channel, String message){
        System.out.println(username + " received notification from " + channel + ": " + message);
    }
}
