package org.example.semaine3.fragilite;

class Pile2<T> {

    private T[] contenu = (T[]) new Object[1000]; // Tableau pour stocker les éléments
    private int pointeurPile = 0; // Indique le sommet de la pile

    // Méthode pour ajouter un élément dans la pile
    public void empiler(T element) {
        contenu[pointeurPile++] = element;
    }

    // Méthode pour retirer et retourner l'élément au sommet de la pile
    public T depiler() {
        return contenu[--pointeurPile];
    }

    // Méthode pour ajouter plusieurs éléments dans la pile
    public void empilerPlusieurs(T[] elements) {
        // Ajoute les éléments au tableau
        System.arraycopy(elements, 0, contenu, pointeurPile, elements.length);

        // Met à jour le pointeur de la pile
        pointeurPile += elements.length;
    }

    // Méthode pour obtenir la taille actuelle de la pile
    public int taille() {
        return contenu.length;
    }

    public static void main(String[] args) {
        // Création d'une instance de Pile
        Pile<Integer> maPile = new Pile<>();

        // Ajouter des éléments dans la pile
        maPile.empiler(10);
        maPile.empiler(20);

        // Ajouter plusieurs éléments
        Integer[] elements = {30, 40, 50};
        maPile.empilerPlusieurs(elements);

        // Afficher la taille actuelle de la pile
        System.out.println("Taille actuelle : " + maPile.taille());

        // Retirer et afficher un élément
        System.out.println("Élément dépilé : " + maPile.depiler());

        // Afficher la taille actuelle de la pile
        System.out.println("Taille actuelle : " + maPile.taille());
    }
}

class PileSurveillable2<T> extends Pile2<T> {

    private int tailleMaximale = 0; // Marqueur de la taille maximale atteinte

    // Méthode pour obtenir la taille maximale atteinte
    public int tailleMaximaleAtteinte() {
        return tailleMaximale;
    }

    // Surcharge de la méthode empiler pour suivre la taille maximale
    @Override
    public void empiler(T element) {
        super.empiler(element);
        if (taille() > tailleMaximale) {
            tailleMaximale = taille();
        }
    }

    // Hérite des méthodes depiler() et empilerPlusieurs() de Pile

    public static void main(String[] args) {
        // Création d'une instance de PileSurveillable
        PileSurveillable2<String> maPile = new PileSurveillable2<>();

        // Ajouter plusieurs éléments dans la pile
        maPile.empilerPlusieurs(new String[]{"abc", "def"});

        System.out.println("Taille actuelle : " + maPile.tailleMaximaleAtteinte());
    }
}
