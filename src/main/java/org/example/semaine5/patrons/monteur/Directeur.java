package org.example.semaine5.patrons.monteur;

// Directeur
class Directeur {
    private Builder builder;

    public Directeur(Builder builder) {
        this.builder = builder;
    }

    public void construireMaisonBasique() {
        builder.construireMurs();
        builder.construireSol();
        builder.construirePorte();
        builder.construireFenetres();
        builder.construireToit();
    }

    public void construireMaisonDeLuxe() {
        builder.construireMurs();
        builder.construireSol();
        builder.construirePorte();
        builder.construireFenetres();
        builder.construireToit();
        builder.construireJardin();
        builder.construirePiscine();
    }
}
