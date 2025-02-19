package org.example.semaine7.momento.example2;

// Memento : Contient l'état sauvegardé de l'Originator
class Memento {
    private String etat;

    public Memento(String etat) {
        this.etat = etat;
    }

    public String getEtat() {
        return etat;
    }
}

