package designPattern.observer;

public class EmailSubscriber implements Subscriber {

    private String email;
    public EmailSubscriber(String email) {this.email = email;}
    public void update(String event)
    {
        System.out.println(email + " notified via email for event " + event);
    }
    
}
