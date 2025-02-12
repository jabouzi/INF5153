// Sous-système : Gestion des commandes
class GestionCommandes {
    public void traiterCommande(String produit) {
        System.out.println("Commande traitée pour le produit : " + produit);
    }
}

// Sous-système : Facturation
class Facturation {
    public void genererFacture(String produit) {
        System.out.println("Facture générée pour le produit : " + produit);
    }
}

// Sous-système : Expédition
class Expedition {
    public void expedierProduit(String produit) {
        System.out.println("Produit expédié : " + produit);
    }
}

// Façade : Représentant du service client
class ServiceClient {
    private GestionCommandes gestionCommandes;
    private Facturation facturation;
    private Expedition expedition;

    public ServiceClient() {
        this.gestionCommandes = new GestionCommandes();
        this.facturation = new Facturation();
        this.expedition = new Expedition();
    }

    // Méthode unifiée pour gérer la commande
    public void passerCommande(String produit) {
        System.out.println("Début du traitement de la commande pour : " + produit);
        gestionCommandes.traiterCommande(produit);
        facturation.genererFacture(produit);
        expedition.expedierProduit(produit);
        System.out.println("Commande terminée pour : " + produit);
    }
}

// Exemple d'utilisation
public class FacadePatternExample {
    public static void main(String[] args) {
        // Création de la façade (représentant du service client)
        ServiceClient serviceClient = new ServiceClient();

        // Le client passe une commande via la façade
        serviceClient.passerCommande("Laptop");
    }
}