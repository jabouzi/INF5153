package org.example.semaine5.patrons.fabrique_abstraite;

// Fabrique Concrète pour les meubles modernes
class FabriqueMeubleModerne implements FabriqueAbstraite {
    @Override
    public Chaise creerChaise() {
        return new ChaiseModerne();
    }

    @Override
    public Sofa creerSofa() {
        return new SofaModerne();
    }

    @Override
    public TableBasse creerTableBasse() {
        return new TableBasseModerne();
    }
}
