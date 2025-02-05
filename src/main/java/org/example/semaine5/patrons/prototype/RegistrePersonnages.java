package org.example.semaine5.patrons.prototype;

import java.util.HashMap;
import java.util.Map;

class RegistrePersonnages {
    private Map<String, Personnage> personnages = new HashMap<>();

    public void ajouterPersonnage(String nom, Personnage personnage) {
        personnages.put(nom, personnage);
    }

    public Personnage obtenirPersonnage(String nom) {
        Personnage personnage = personnages.get(nom);
        return personnage != null ? personnage.clone() : null;
    }
}