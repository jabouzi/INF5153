package org.example.semaine5.patrons.prototype;

class Guerrier implements Personnage {
    private String nom;
    private String arme;

    public Guerrier(String nom, String arme) {
        this.nom = nom;
        this.arme = arme;
    }

    @Override
    public Personnage clone() {
        return new Guerrier(this.nom, this.arme);
    }

    public void attaquer() {
        System.out.println(nom + " attaque avec " + arme + " !");
    }

    @Override
    public String toString() {
        return "Guerrier { nom='" + nom + "', arme='" + arme + "' }";
    }
}
