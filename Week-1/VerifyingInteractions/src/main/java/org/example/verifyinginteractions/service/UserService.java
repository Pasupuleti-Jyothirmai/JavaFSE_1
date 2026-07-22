package org.example.verifyinginteractions.service;

import org.example.verifyinginteractions.external.NotificationService;

public class UserService {

    private NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void registerUser(String name) {
        notificationService.sendNotification("Welcome " + name);
    }
}