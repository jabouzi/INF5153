package org.example.semaine11.composite_builder.apres;

public class Main {
    public static void main(String[] args) {
        XMLBuilder builder = new XMLBuilder("rapport");
        String xml = builder
                .ouvrirBalise("section")
                .ouvrirBalise("titre")
                .ajouterTexte("Introduction")
                .fermerBalise()
                .ouvrirBalise("paragraphe")
                .ajouterTexte("Ceci est un test.")
                .fermerBalise()
                .fermerBalise()
                .build();

        System.out.println(xml);
        //<rapport><section><titre>Introduction</titre><paragraphe>Ceci est un test.</paragraphe></section></rapport>
    }
}
