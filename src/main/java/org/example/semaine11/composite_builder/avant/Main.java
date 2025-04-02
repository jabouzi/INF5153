package org.example.semaine11.composite_builder.avant;

import org.example.semaine11.composite_builder.common.CompositeXML;
import org.example.semaine11.composite_builder.common.FeuilleXML;

public class Main {
    public static void main(String[] args) {
        // 1. Création manuelle d'une structure Composite (arbre XML)
        CompositeXML racine = new CompositeXML("rapport");

        CompositeXML section1 = new CompositeXML("section");
        section1.ajouter(new FeuilleXML("<titre>Introduction</titre>"));
        section1.ajouter(new FeuilleXML("<paragraphe>Ceci est un test.</paragraphe>"));

        CompositeXML section2 = new CompositeXML("section");
        section2.ajouter(new FeuilleXML("<titre>Conclusion</titre>"));

        // Problème : Oubli possible d'ajouter une section à la racine !
        racine.ajouter(section1);
        // racine.ajouter(section2); // Oublié volontairement pour l'exemple

        // 2. Affichage du XML généré (avec erreur potentielle)
        System.out.println("=== XML Généré (AVANT Builder) ===");
        System.out.println(racine.toXML());
    }
}
