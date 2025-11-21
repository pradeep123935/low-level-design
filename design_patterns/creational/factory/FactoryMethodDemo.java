package design_patterns.creational.factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        NotificationCreator creator;

        creator = new EmailNotificationCreator();
        creator.send("Welcome to platform");

        creator = new SMSNotificationCreator();
        creator.send("Welcome to platform");

        creator = new SlackNotificationCreator();
        creator.send("Welcome to platform");
    }
}
