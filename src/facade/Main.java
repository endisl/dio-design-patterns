package facade;

public class Main {

    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appID", "key");
        var message = new Message("Hello World");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
