package design_patterns.creational.factory;

public class SlackNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending slack message"+message);
    }
}
