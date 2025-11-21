package design_patterns.creational.factory;

public class SMSNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
    
}
