import editor.YoutubeChannel;
import users.EmailNotificationUser;
import users.SystemNotificationUser;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtube = new YoutubeChannel();

        youtube.createChannel("The Organic Chemistry Tutor");
        youtube.createChannel("Lofi Girl");

        EmailNotificationUser user1 = new EmailNotificationUser("Aizada", "sembayeva@gmail.com");
        SystemNotificationUser user2 = new SystemNotificationUser("Nursultan");

        youtube.getSubscription().subscribe("The Organic Chemistry Tutor", user1);
        youtube.getSubscription().subscribe("The Organic Chemistry Tutor", user2);
        youtube.getSubscription().subscribe("Lofi Girl", user1);

        youtube.createVideo("The Organic Chemistry Tutor", "Understand Calculus in 35 Minutes");
        youtube.createShorts("Lofi Girl", "I Need a Break");

        youtube.getSubscription().unsubscribe("The Organic Chemistry Tutor", user1);

        youtube.createVideo("The Organic Chemistry Tutor", "Calculus 1 - Introduction to Limits");
    }
}