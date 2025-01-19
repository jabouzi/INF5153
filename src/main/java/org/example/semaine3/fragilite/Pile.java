package org.example.semaine3.fragilite;

import java.util.*;

// Classe Pile modifiée
class Pile<T> {

    ArrayList<T> contenu = new ArrayList<>(); // Contient les éléments de la pile
    private int pointeurPile = 0; // Indique le sommet de la pile

    // Méthode pour ajouter un élément dans la pile
    public void empiler(T element) {
        contenu.add(pointeurPile++, element);
    }

    // Méthode pour retirer et retourner l'élément au sommet de la pile
    public T depiler() {
        return contenu.remove(--pointeurPile);
    }

    // Méthode pour ajouter plusieurs éléments dans la pile
    public void empilerPlusieurs(T[] elements) {
        for (T element : elements) {
            empiler(element);
        }
    }

    // Méthode pour obtenir la taille actuelle de la pile
    public int taille() {
        return contenu.size();
    }

    public static void main(String[] args) {
        // Créer une instance de Pile
        Pile<String> maPile = new Pile<>();

        // Empiler plusieurs éléments
        String[] elements = {"A", "B", "C", "D"};
        maPile.empilerPlusieurs(elements);

        // Afficher la taille de la pile
        System.out.println("Taille de la pile : " + maPile.taille());

        // Dépiler les éléments et les afficher
        while (maPile.taille() > 0) {
            System.out.println("Élément dépilé : " + maPile.depiler());
        }

        // Afficher la taille de la pile
        System.out.println("Taille de la pile : " + maPile.taille());
    }
}

class PileSurveillable<T> extends Pile<T> {

    private int marqueHaute = 0; // Taille maximale atteinte par la pile

    // Méthode pour obtenir la taille maximale atteinte jusqu'à présent
    public int tailleMaximaleAtteinte() {
        return marqueHaute;
    }

    // Surcharge de la méthode empiler pour surveiller la taille de la pile
    @Override
    public void empiler(T element) {
        super.empiler(element);
        if (taille() > marqueHaute) {
            marqueHaute = taille();
        }
    }

    // Hérite des méthodes depiler() et empilerPlusieurs() de la classe Pile

    public static void main(String[] args) {
        // Création d'une pile surveillable
        PileSurveillable<String> maPile = new PileSurveillable<>();

        // Empiler des éléments
        String[] elements = {"B", "C", "D"};
        maPile.empilerPlusieurs(elements);

        // Afficher la taille maximale atteinte
        System.out.println("Taille maximale atteinte : " + maPile.tailleMaximaleAtteinte());
    }
}
