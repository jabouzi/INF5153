package org.example.semaine11.hard_coded_notifications_with_observer.apres;

import org.example.semaine11.hard_coded_notifications_with_observer.common.Observateur;

public class AnalyticsService implements Observateur {
    @Override
    public void actualiser(String evenement) {
        System.out.println("[Analytics actualiser] Suivi : " + evenement);
    }

    @Override
    public void enregistrer(String clique) {
        System.out.println("[Analytics enregistrer] Suivi : " + clique);
    }
}
