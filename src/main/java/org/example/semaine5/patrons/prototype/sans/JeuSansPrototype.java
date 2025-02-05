package org.example.semaine5.patrons.prototype.sans;

public class JeuSansPrototype {
    public static void main(String[] args) {
        // Création des personnages
        Guerrier guerrierOriginal = new Guerrier("Conan", "Épée longue");
        Magicien mageOriginal = new Magicien("Gandalf", "Boule de feu");

        // Copie manuelle des personnages
        Guerrier guerrierCopie = guerrierOriginal.copier();
        Magicien mageCopie = mageOriginal.copier();

        // Utilisation des copies
        guerrierCopie.attaquer();
        mageCopie.lancerSort();

        // Affichage des copies
        System.out.println("Guerrier copié : " + guerrierCopie);
        System.out.println("Magicien copié : " + mageCopie);
    }
}
