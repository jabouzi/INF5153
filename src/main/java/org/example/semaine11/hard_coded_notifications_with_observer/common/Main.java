package org.example.semaine11.hard_coded_notifications_with_observer.common;


import org.example.semaine11.hard_coded_notifications_with_observer.apres.AnalyticsService;
import org.example.semaine11.hard_coded_notifications_with_observer.apres.Bouton;
import org.example.semaine11.hard_coded_notifications_with_observer.avant.BoutonOld;
public class Main {
    public static void main(String[] args) {
        // AVANT : Approche hard-codée
        LogService logger = new LogService();
        BoutonOld boutonOld = new BoutonOld(logger);
        boutonOld.cliquer();

        // APRÈS : Approche Observer
        Bouton bouton = new Bouton();
        bouton.abonner(new LogService());
        bouton.abonner(new AnalyticsService());

        System.out.println("\n=== Notifications multi-observers ===");
        bouton.cliquer();
    }
}
