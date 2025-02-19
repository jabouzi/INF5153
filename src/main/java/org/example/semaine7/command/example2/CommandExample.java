package org.example.semaine7.command.example2;

// Utilisation
public class CommandExample {
    public static void main(String[] args) {
        Cuisinier cuisinier = new Cuisinier();
        Commande commandePizza = new CommandeCuisine(cuisinier, "Pizza");

        Serveuse serveuse = new Serveuse();
        serveuse.prendreCommande(commandePizza);

        serveuse.passerCommande();   // Cuisinier prepare : Pizza
        serveuse.annulerCommande();  // Annulation de la preparation de : Pizza
    }
}
