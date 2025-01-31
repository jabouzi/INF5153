package org.example.semaine4.solid.dip.ex1.violation;

// Module haut niveau
public class GestionnaireNotification {
    private ServiceEmail serviceEmail;

    public GestionnaireNotification() {
        this.serviceEmail = new ServiceEmail();
    }

    public void notifier(String message) {
        serviceEmail.envoyerEmail(message);
    }
}
