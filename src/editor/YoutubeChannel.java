package editor;

import publisher.Subscription;

public class YoutubeChannel {
    private Subscription subscription;

    public YoutubeChannel() {
        subscription = new Subscription();
    }

    public void createChannel(String name) {
        subscription.addChannel(name);
        System.out.println("New channel created: " + name);
    }

    public void createVideo(String channel, String title) {
        subscription.notify(channel, "New video: " + title);
    }

    public void createShorts(String channel, String title) {
        subscription.notify(channel, "New short: " + title);
    }

    public Subscription getSubscription() {
        return subscription;
    }
}
