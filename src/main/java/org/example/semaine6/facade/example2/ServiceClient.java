package org.example.semaine6.facade.example2;

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
