package design_patterns.creational.factory;

public class SlackNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new SlackNotification();
    }
    
}
