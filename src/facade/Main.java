package facade;

public class Main {

    public static void main(String[] args) {
        var service = new NotificationService();
        service.send("Hello World", "target");
    }
}
