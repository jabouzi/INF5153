package org.example.semaine7.observer.example2;

import java.util.ArrayList;
import java.util.List;

class Enchere {
    private List<Observateur> observateurs = new ArrayList<>();
    private int prixActuel;

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void setPrixActuel(int prix) {
        this.prixActuel = prix;
        notifierObservateurs();
    }

    private void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.actualiser("Nouveau prix : " + prixActuel);
        }
    }
}
