package design_patterns.creational.factory;

public class EmailNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
    
}
