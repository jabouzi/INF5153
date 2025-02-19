package org.example.semaine7.iterator.example2;

// Utilisation
public class IteratorExample {
    public static void main(String[] args) {
        String[] chaines = {"CNN", "ESPN", "FOX"};
        Iterator iterateur = new SelecteurChaines(chaines);

        while (iterateur.aSuivant()) {
            System.out.println("Chaine suivante : " + iterateur.suivant());
        }
    }
}
