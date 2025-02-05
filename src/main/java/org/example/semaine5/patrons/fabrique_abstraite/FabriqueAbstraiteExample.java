package org.example.semaine5.patrons.fabrique_abstraite;

// Code Client
public class  FabriqueAbstraiteExample {
    public static void main(String[] args) {
        // Choix de la fabrique en fonction du style (moderne ou victorien)
        FabriqueAbstraite fabrique = new FabriqueMeubleModerne(); // ou new FabriqueMeubleVictorien()

        // Création des meubles
        Chaise chaise = fabrique.creerChaise();
        Sofa sofa = fabrique.creerSofa();
        TableBasse tableBasse = fabrique.creerTableBasse();

        // Utilisation des meubles
        chaise.sasseoir();
        sofa.allonger();
        tableBasse.poserObjet();
    }
}
