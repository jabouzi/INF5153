package org.example.semaine5.patrons.monteur;

// Constructeur de Maison
class ConstructeurMaison implements Builder {
    private Maison maison;

    public ConstructeurMaison() {
        this.maison = new Maison();
    }

    @Override
    public void construireMurs() {
        maison.setMurs("Murs en brique");
    }

    @Override
    public void construireSol() {
        maison.setSol("Sol en carrelage");
    }

    @Override
    public void construirePorte() {
        maison.setPorte("Porte en bois");
    }

    @Override
    public void construireFenetres() {
        maison.setFenetres("Fenêtres en verre");
    }

    @Override
    public void construireToit() {
        maison.setToit("Toit en tuiles");
    }

    @Override
    public void construireJardin() {
        maison.setJardin("Jardin avec pelouse");
    }

    @Override
    public void construirePiscine() {
        maison.setPiscine("Piscine creusée");
    }

    @Override
    public Maison getResultat() {
        return maison;
    }
}
