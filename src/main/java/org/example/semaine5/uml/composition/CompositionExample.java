package org.example.semaine5.uml.composition;

// Main
public class CompositionExample {
    public static void main(String[] args) {
        Maison maison = new Maison("123 Rue Principale");
        Chambre chambre1 = new Chambre(101);
        Chambre chambre2 = new Chambre(102);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);

        maison.afficherPieces();
    }
}
