package org.example.semaine6.prototype;

// Exemple d'utilisation
public class PrototypePatternExample {
    public static void main(String[] args) {
        // Création d'une personne originale
        Personne personneOriginale = new Personne("Alice", 30, "123 Rue de Paris");

        // Affichage des détails de la personne originale
        System.out.println("Personne originale :");
        personneOriginale.afficherDetails();

        // Création d'une copie de la personne avec un nouveau nom
        Personne personneCopiee = personneOriginale.copy("Bob");

        // Affichage des détails de la personne copiée
        System.out.println("\nPersonne copiée :");
        personneCopiee.afficherDetails();
    }
}
