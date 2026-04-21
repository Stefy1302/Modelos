package src;

public class NotificationStore {
    SimpleNotificationFactory factory;

    public NotificationStore(SimpleNotificationFactory factory) {
        this.factory = factory;
    }

    public Notification orderNotification(String type, String message) {
        Notification notification;

        notification = factory.createNotification(type);

        if (notification != null) {
            notification.prepare();
            notification.send(message);
        }

        return notification;
    }
}