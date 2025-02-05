package org.example.semaine5.patrons.fabrique_abstraite.sans;

// Sans Patron de Conception (Fabrique Abstraite)
// Problème :
// Vous devez créer des meubles de différents styles (moderne et victorien) sans mélanger les styles.
// Sans la fabrique abstraite, le code est directement couplé aux classes concrètes.
public class SansFabriqueAbstraiteExample {
    public static void main(String[] args) {
        // Création directe des meubles modernes
        ChaiseModerne chaiseModerne = new ChaiseModerne();
        SofaModerne sofaModerne = new SofaModerne();
        TableBasseModerne tableBasseModerne = new TableBasseModerne();

        // Utilisation des meubles modernes
        chaiseModerne.sasseoir();
        sofaModerne.allonger();
        tableBasseModerne.poserObjet();

        // Création directe des meubles victoriens
        ChaiseVictorienne chaiseVictorienne = new ChaiseVictorienne();
        SofaVictorien sofaVictorien = new SofaVictorien();
        TableBasseVictorienne tableBasseVictorienne = new TableBasseVictorienne();

        // Utilisation des meubles victoriens
        chaiseVictorienne.sasseoir();
        sofaVictorien.allonger();
        tableBasseVictorienne.poserObjet();
    }
}
