package design_patterns.creational.factory;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

}
