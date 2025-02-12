package org.example.semaine6.decorator.window;

class BarreDefilement extends DecorateurAffichage {
    public BarreDefilement(Affichage affichage) {
        super(affichage);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("Ajouter une barre de défilement");
    }
}
