package org.example.semaine6.decorator.window;

// Composant concret (fenêtre de base)
class Fenetre implements Affichage {
    @Override
    public void dessiner() {
        System.out.println("Dessiner une fenêtre de base");
    }
}
