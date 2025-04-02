package org.example.semaine11.composite_builder.common;

import org.example.semaine11.composite_builder.avant.NoeudXML;

import java.util.ArrayList;
import java.util.List;

// Composite (balise avec enfants)
public class CompositeXML implements NoeudXML {
    private String balise;
    private List<NoeudXML> enfants = new ArrayList<>();

    public CompositeXML(String balise) {
        this.balise = balise;
    }

    public void ajouter(NoeudXML enfant) {
        enfants.add(enfant);
    }

    @Override
    public String toXML() {
        StringBuilder xml = new StringBuilder("<" + balise + ">");
        enfants.forEach(e -> xml.append(e.toXML()));
        return xml.append("</" + balise + ">").toString();
    }
}
