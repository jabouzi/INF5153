package org.example.semaine9.observer.example2;

class Enchirisseur implements Observateur {
    private String nom;

    public Enchirisseur(String nom) {
        this.nom = nom;
    }

    @Override
    public void actualiser(String message) {
        System.out.println(nom + " a recu : " + message);
    }
}
