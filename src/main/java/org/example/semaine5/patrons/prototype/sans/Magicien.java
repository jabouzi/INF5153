package org.example.semaine5.patrons.prototype.sans;

class Magicien {
    private String nom;
    private String sort;

    public Magicien(String nom, String sort) {
        this.nom = nom;
        this.sort = sort;
    }

    public Magicien copier() {
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