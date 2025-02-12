package org.example.semaine6.facade.example2;

public class FacadeExample {
    public static void main(String[] args) {
        // Création de la façade (représentant du service client)
        ServiceClient serviceClient = new ServiceClient();

        // Le client passe une commande via la façade
        serviceClient.passerCommande("Laptop");
    }
}

/*
Début du traitement de la commande pour : Laptop
Commande traitée pour le produit : Laptop
Facture générée pour le produit : Laptop
Produit expédié : Laptop
Commande terminée pour : Laptop
 */
