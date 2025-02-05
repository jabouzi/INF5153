package org.example.semaine5.patrons.fabrique_abstraite;

// Interface Fabrique Abstraite
interface FabriqueAbstraite {
    Chaise creerChaise();

    Sofa creerSofa();

    TableBasse creerTableBasse();
}
