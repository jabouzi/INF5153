package org.example.semaine6.decorator.window;

// Décorateur abstrait
abstract class DecorateurAffichage implements Affichage {
    protected Affichage affichage;

    public DecorateurAffichage(Affichage affichage) {
        this.affichage = affichage;
    }

    @Override
    public void dessiner() {
        affichage.dessiner();
    }
}
