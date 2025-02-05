package org.example.semaine5.patrons.fabrique_abstraite;

// Fabrique Concrète pour les meubles victoriens
class FabriqueMeubleVictorien implements FabriqueAbstraite {
    @Override
    public Chaise creerChaise() {
        return new ChaiseVictorienne();
    }

    @Override
    public Sofa creerSofa() {
        return new SofaVictorien();
    }

    @Override
    public TableBasse creerTableBasse() {
        return new TableBasseVictorienne();
    }
}
