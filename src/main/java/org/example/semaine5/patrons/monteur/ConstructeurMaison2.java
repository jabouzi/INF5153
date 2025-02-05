package org.example.semaine5.patrons.monteur;

// Constructeur de Maison
class ConstructeurMaison2 implements Builder2 {
    private Maison2 maison;

    public ConstructeurMaison2() {
        this.maison = new Maison2()
                .setMurs("Murs en brique")
                .setFenetres("Fenêtres en verre")
                .setPorte("Porte en bois")
                .setSol("Sol en carrelage")
                .setToit("Toit en tuiles")
                .setJardin("Jardin avec pelouse")
                .setPiscine("Piscine creusée");
    }

    @Override
    public Maison2 getResultat() {
        return maison;
    }
}
