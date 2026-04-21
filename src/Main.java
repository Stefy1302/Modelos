package src;

public class Main {
    public static void main(String[] args) {
        SimpleNotificationFactory factory = new SimpleNotificationFactory();
        NotificationStore store = new NotificationStore(factory);

        System.out.println("--- First Request ---");
        store.orderNotification("email", "Your package has shipped!");

        System.out.println("\n--- Second Request ---");
        store.orderNotification("whatsapp", "Are you home?");
    }
}