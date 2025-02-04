package designPattern.observer;

public class Main {
    public static void main(String args[])
    {
        YoutubeChannel myChannel = new YoutubeChannel("BeastLife");
        UserSubscriber userSubscriber = new UserSubscriber("Neeladri");
        EmailSubscriber emailSubscriber = new EmailSubscriber("neeladridas1603@gmail.com");

        myChannel.addSubscriber(emailSubscriber);
        myChannel.addSubscriber(userSubscriber);

        myChannel.upload("My first video from jamshedpur");
    }
}
