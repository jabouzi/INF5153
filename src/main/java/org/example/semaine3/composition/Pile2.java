package org.example.semaine3.composition;

import java.util.*;

// Solution où l'héritage n'est pas toujours la solution
class Pile2<T> {

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

    public static void main(String[] args) {
        // Création d'une pile pour des chaînes de caractères
        Pile2<String> maPile = new Pile2<>();

        // Ajout d'un élément dans la pile
        maPile.empiler("1");

        // Retrait de l'élément au sommet de la pile
        String elementDepile = maPile.depiler();

        // Affichage de l'élément retiré
        System.out.println("Élément dépilé : " + elementDepile);
    }
}
