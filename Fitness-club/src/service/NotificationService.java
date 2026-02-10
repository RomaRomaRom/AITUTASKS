package service;

import domain.Client;

public class NotificationService {

    public void notify(Client client, String message) {
        System.out.println(
            "Notification for " + client.getName() + ": " + message
        );
    }
}
