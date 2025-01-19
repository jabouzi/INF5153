package org.example.semaine3.delegation;

public class Achat {
    private double prix; // Prix de l'achat
    private final double tvq = 0.09975; // Taxe de vente du Québec (9.975%)
    private final double tps = 0.05; // Taxe sur les produits et services (5%)

    // Constructeur pour initialiser le prix
    public Achat(double prix) {
        this.prix = prix;
    }
            
    // Getter pour le prix
    public double getPrix() {
        return prix;
    }
            
    // Getter pour la TVQ
    public double getTvq() {
        return tvq;
    }
            
    // Getter pour la TPS
    public double getTps() {
        return tps;
    }

    public static void main(String[] args) {
        // Création d'un achat avec un prix de base sans délégation
        Achat achat = new Achat(100.0); // 100 $ comme prix de base

        // Calcul des taxes
        double prix = achat.getPrix();
        double totalTaxes = (prix * achat.getTvq()) + (prix * achat.getTps());
        double prixAvecTaxes = prix + totalTaxes;

        // Affichage du prix total avec taxes
        System.out.printf("Prix avec taxes : %.2f $", prixAvecTaxes);
    }
}

        
