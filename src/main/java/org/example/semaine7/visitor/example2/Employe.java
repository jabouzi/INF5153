package org.example.semaine7.visitor.example2;

class Employe {
    private String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void accepter(Visiteur visiteur) {
        visiteur.visiter(this);
    }
}
