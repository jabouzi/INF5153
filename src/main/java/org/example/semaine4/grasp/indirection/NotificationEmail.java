package org.example.semaine4.grasp.indirection;

class NotificationEmail implements CanalNotification {
    @Override
    public void envoyerNotification(String message) {
        System.out.println("Email envoyé : " + message);
    }
}
