package src;    

public class EmailNotification extends Notification {
    public EmailNotification() {
        name = "Email Notification";
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
