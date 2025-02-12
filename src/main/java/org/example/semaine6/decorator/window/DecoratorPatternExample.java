package org.example.semaine6.decorator.window;

// Exemple d'utilisation
public class DecoratorPatternExample {
    public static void main(String[] args) {
        // Création d'une fenêtre de base
        Affichage fenetre = new Fenetre();

        // Ajout de décorateurs dynamiquement
        Affichage fenetreAvecBarres = new BarreDefilement(
                new BarreEtat(
                        new BarreOutils(fenetre)
                )
        );

        // Affichage de la fenêtre avec les décorateurs
        fenetreAvecBarres.dessiner();
    }
}
