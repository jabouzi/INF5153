package org.example.semaine11.hard_coded_notifications_with_observer.avant;

import org.example.semaine11.hard_coded_notifications_with_observer.common.LogService;

public class BoutonOld {
    private LogService logService;
    public BoutonOld(LogService logService) { this.logService = logService; }
    public void cliquer() {
        System.out.println("Bouton cliqué ! (Old)");
        logService.enregistrer("Clique");
    }
}
