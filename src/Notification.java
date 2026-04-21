package src;   

public abstract class Notification {
    String name;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public abstract void send(String message);
    
    public String getName() {
        return name;
    }
}