package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private List<Subscriber> subscribers;
    private String name;

    public YoutubeChannel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {this.subscribers.add(subscriber);}

    public void removeSubscriber(Subscriber subscriber) {this.subscribers.remove(subscriber);}

    private void notifySubscribers(String event)
    {
        for(Subscriber subscriber : subscribers)
        {
            subscriber.update(event);
        }
    }

    public void upload(String videoName)
    {
        String event = "New video " + videoName + " uploaded by " + this.name;
        notifySubscribers(event);
    }
    
}
