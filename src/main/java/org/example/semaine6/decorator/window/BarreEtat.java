package org.example.semaine6.decorator.window;

class BarreEtat extends DecorateurAffichage {
    public BarreEtat(Affichage affichage) {
        super(affichage);
    }

    @Override
    public void dessiner() {
        super.dessiner();
        System.out.println("Ajouter une barre d'état");
    }
}
