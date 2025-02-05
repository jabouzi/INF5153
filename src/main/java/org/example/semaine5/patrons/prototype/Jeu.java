package org.example.semaine5.patrons.prototype;

public class Jeu {
    public static void main(String[] args) {
        // Création des prototypes
        Guerrier guerrierOriginal = new Guerrier("Conan", "Épée longue");
        Magicien magicienOriginal = new Magicien("Gandalf", "Boule de feu");

        // Ajout des prototypes au registre
        RegistrePersonnages registre = new RegistrePersonnages();
        registre.ajouterPersonnage("Guerrier1", guerrierOriginal);
        registre.ajouterPersonnage("Magicien1", magicienOriginal);

        // Récupération et clonage des personnages
        Personnage guerrierClone = registre.obtenirPersonnage("Guerrier1");
        Personnage magicienClone = registre.obtenirPersonnage("Magicien1");

        // Utilisation des clones
        if (guerrierClone instanceof Guerrier) {
            ((Guerrier) guerrierClone).attaquer();
        }
        if (magicienClone instanceof Magicien) {
            ((Magicien) magicienClone).lancerSort();
        }

        // Affichage des clones
        System.out.println("Guerrier cloné : " + guerrierClone);
        System.out.println("Magicien cloné : " + magicienClone);
    }
}
