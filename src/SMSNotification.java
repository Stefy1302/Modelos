package src;

public class SMSNotification extends Notification {
    public SMSNotification() {
        name = "SMS Notification";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}