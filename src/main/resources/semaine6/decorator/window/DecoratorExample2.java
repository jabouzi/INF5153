// Interface pour l'affichage graphique
interface Affichage {
    void dessiner();
}

// Composant concret (fenêtre de base)
class Fenetre implements Affichage {
    @Override
    public void dessiner() {
        System.out.println("Dessiner une fenêtre de base");
    }
}

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