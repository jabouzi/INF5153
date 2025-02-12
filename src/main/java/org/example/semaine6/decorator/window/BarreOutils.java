package org.example.semaine6.decorator.window;

// Décorateurs concrets (barre d'outils, barre d'état, barre de défilement)
class BarreOutils extends DecorateurAffichage {
    public BarreOutils(Affichage affichage) {
        super(affichage);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("Ajouter une barre d'outils");
    }
}
