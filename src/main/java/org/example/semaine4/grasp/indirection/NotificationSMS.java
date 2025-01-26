package org.example.semaine4.grasp.indirection;

class NotificationSMS implements CanalNotification {
    @Override
    public void envoyerNotification(String message) {
        System.out.println("SMS envoyé : " + message);
    }
}
