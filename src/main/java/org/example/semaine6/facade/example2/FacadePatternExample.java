package org.example.semaine6.facade.example2;

// Exemple d'utilisation
public class FacadePatternExample {
    public static void main(String[] args) {
        // Création de la façade (représentant du service client)
        ServiceClient serviceClient = new ServiceClient();

        // Le client passe une commande via la façade
        serviceClient.passerCommande("Laptop");
    }
}
