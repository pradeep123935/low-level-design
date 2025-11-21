package design_patterns.creational.factory;

public class SMSNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending sms :" + message);
    }

}
