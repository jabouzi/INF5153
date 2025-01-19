package org.example.semaine3.composition;

import java.util.*;

// Exemple où l'héritage n'est pas toujours la solution
class Pile<T> extends ArrayList<T> {

    private int pointeurPile = 0; // Indique le sommet de la pile

    // Méthode pour ajouter un élément dans la pile
    public void empiler(T element) {
        add(pointeurPile++, element);
    }

    // Méthode pour retirer et retourner l'élément au sommet de la pile
    public T depiler() {
        return remove(--pointeurPile);
    }

    public static void main(String[] args) {
        // Instancier correctement la pile
        Pile<String> maPile = new Pile<>();

        // Ajouter un élément dans la pile
        maPile.empiler("1");

        // Vider la pile
        maPile.clear();

        // Retirer un élément de la pile
        String elementDepile = maPile.depiler();

        // Afficher l'élément retiré
        System.out.println("Élément dépilé : " + elementDepile);
    }
}
