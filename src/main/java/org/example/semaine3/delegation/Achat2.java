package org.example.semaine3.delegation;

public class Achat2 {
    private double prix; // Prix de l'achat
    private final double tvq = 0.09975; // Taxe de vente du Québec (9.975%)
    private final double tps = 0.05; // Taxe sur les produits et services (5%)

    // Constructeur pour initialiser le prix
    public Achat2(double prix) {
        this.prix = prix;
    }
            
    // Méthode pour calculer le prix total avec taxes
    public double calculerPrixAvecTaxes() {
        double totalTaxes = (prix * tvq) + (prix * tps);
        return prix + totalTaxes;
    }
            
    // Getter pour le prix de base (optionnel si nécessaire)
    public double getPrix() {
        return prix;
    }

    public static void main(String[] args) {
        // Création d'un achat avec un prix de base avec délégation
        Achat2 achat = new Achat2(100.0); // 100 $ comme prix de base

        // Calcul du prix total avec taxes via la méthode de la classe Achat2
        double prixAvecTaxes = achat.calculerPrixAvecTaxes();

        // Affichage du prix total avec taxes
        System.out.printf("Prix avec taxes : %.2f $", prixAvecTaxes);
    }
}
