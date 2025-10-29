package publisher;

import users.IUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subscription {
    private Map<String, List<IUser>> subscribers = new HashMap<>();

    public Subscription(String... channels) {
        for (String channel : channels) {
            this.subscribers.put(channel, new ArrayList<>());
        }
    }

    public void addChannel(String channel) {
        subscribers.putIfAbsent(channel, new ArrayList<>());
    }

    public void subscribe(String channel, IUser user) {
        List<IUser> users = subscribers.get(channel);
        users.add(user);
    }

    public void unsubscribe(String channel, IUser user) {
        List<IUser> users = subscribers.get(channel);
        users.remove(user);
    }

    public void notify(String channel, String message) {
        List<IUser> users = subscribers.get(channel);
        for(IUser u : users) {
            u.update(channel, message);
        }
    }
}
