package org.example.semaine11.composite_builder.apres;

import org.example.semaine11.composite_builder.common.CompositeXML;
import org.example.semaine11.composite_builder.common.FeuilleXML;

import java.util.Stack;

public class XMLBuilder {
    private CompositeXML racine;
    private Stack<CompositeXML> pile = new Stack<>();

    public XMLBuilder(String baliseRacine) {
        this.racine = new CompositeXML(baliseRacine);
        pile.push(racine);
    }

    // Méthodes fluides
    public XMLBuilder ouvrirBalise(String balise) {
        CompositeXML nouveau = new CompositeXML(balise);
        pile.peek().ajouter(nouveau);
        pile.push(nouveau);
        return this;
    }

    public XMLBuilder fermerBalise() {
        pile.pop();
        return this;
    }

    public XMLBuilder ajouterTexte(String texte) {
        pile.peek().ajouter(new FeuilleXML(texte));
        return this;
    }

    public String build() {
        return racine.toXML();
    }
}
