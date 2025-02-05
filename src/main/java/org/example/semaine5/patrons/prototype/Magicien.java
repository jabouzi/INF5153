package org.example.semaine5.patrons.prototype;

class Magicien implements Personnage {
    private String nom;
    private String sort;

    public Magicien(String nom, String sort) {
        this.nom = nom;
        this.sort = sort;
    }

    @Override
    public Personnage clone() {
        return new Magicien(this.nom, this.sort);
    }

    public void lancerSort() {
        System.out.println(nom + " lance le sort " + sort + " !");
    }

    @Override
    public String toString() {
        return "Mage { nom='" + nom + "', sort='" + sort + "' }";
    }
}
