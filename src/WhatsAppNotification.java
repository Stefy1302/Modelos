package src;

public class WhatsAppNotification extends Notification {
    public WhatsAppNotification() {
        name = "WhatsApp Notification";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }
}