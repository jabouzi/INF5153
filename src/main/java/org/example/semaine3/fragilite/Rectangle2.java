package org.example.semaine3.fragilite;

class Rectangle2 {
    private int longueur;
    private int largeur;

    public Rectangle2(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    // Getter pour la largeur
    public int getLargeur() {
        return largeur;
    }

    public int calculerAire() {
        return longueur * largeur;
    }
}

// Carré EST-UN Rectangle
class Carre2 extends Rectangle2 {
    public Carre2(int cote) {
        super(cote, cote);
    }

    public static void main(String[] args) {
        Carre2 carre = new Carre2(5);
        System.out.println("Aire du carré (25?) " + carre.calculerAire()); // OK

        // définir la largeur du carré n'sst plus valide :)
        //carre.setLargeur(9);
    }
}

