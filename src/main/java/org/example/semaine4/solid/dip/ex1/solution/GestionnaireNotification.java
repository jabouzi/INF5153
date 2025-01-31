package org.example.semaine4.solid.dip.ex1.solution;

// Module haut niveau
public class GestionnaireNotification {
    private Notificateur notificateur;

    public GestionnaireNotification(Notificateur notificateur) {
        this.notificateur = notificateur;
    }

    public void notifier(String message) {
        notificateur.envoyer(message);
    }
}
