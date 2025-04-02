package org.example.semaine11.hard_coded_notifications_with_observer.apres;

import org.example.semaine11.hard_coded_notifications_with_observer.common.Observateur;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
public class Bouton {
    private List<Observateur> observateurs = new ArrayList<>();

    public void abonner(Observateur obs) {
        observateurs.add(obs);
    }

    public void cliquer() {
        System.out.println("Bouton cliqué !");
        notifier("Clique");
    }

    private void notifier(String evenement) {
        observateurs.forEach(obs -> obs.actualiser(evenement));
    }
}

