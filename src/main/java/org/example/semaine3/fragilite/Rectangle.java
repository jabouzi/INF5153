package org.example.semaine3.fragilite;

class Rectangle {
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    // Setter pour la longueur
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    // Getter pour la largeur
    public int getLargeur() {
        return largeur;
    }

    // Setter pour la largeur
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int calculerAire() {
        return longueur * largeur;
    }
}

// Carré EST-UN Rectangle
class Carre extends Rectangle {
    public Carre(int cote) {
        super(cote, cote);
    }

    public static void main(String[] args) {
        Carre carre = new Carre(5);
        System.out.println("Aire du carré (25?) " + carre.calculerAire()); // OK

        // définir la largeur du carré :(
        carre.setLargeur(9);
        System.out.println("Aire du nouveau carré (81?) " + carre.calculerAire());  // Ohh nooon
    }
}
