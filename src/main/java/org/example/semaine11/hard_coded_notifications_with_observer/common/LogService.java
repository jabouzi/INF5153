package org.example.semaine11.hard_coded_notifications_with_observer.common;

// Observers concrets
public class LogService implements Observateur {
    @Override
    public void actualiser(String evenement) {
        System.out.println("[LOG actualiser] Événement : " + evenement);
    }

    @Override
    public void enregistrer(String clique) {
        System.out.println("[LOG enregistrer] Événement : " + clique);
    }
}
