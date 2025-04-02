package org.example.semaine11.composite_builder.common;

import org.example.semaine11.composite_builder.avant.NoeudXML;

// Feuille (texte/balise simple)
public class FeuilleXML implements NoeudXML {
    private String contenu;

    public FeuilleXML(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toXML() {
        return contenu;
    }
}
