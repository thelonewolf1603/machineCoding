package designPattern.observer;

public class UserSubscriber implements Subscriber{
    private String name;
    public UserSubscriber(String name) {this.name = name;}
    public void update(String event)
    {
        System.out.println(name + " notified via in-app notification for event: " + event);
    }
}
