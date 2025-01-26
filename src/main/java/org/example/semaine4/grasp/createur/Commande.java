package org.example.semaine4.grasp.createur;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private List<LigneCommande> lignesCommande;

    public Commande() {
        this.lignesCommande = new ArrayList<>();
    }

    public void ajouterLigneCommande(Produit produit, int quantite) {
        lignesCommande.add(new LigneCommande(produit, quantite));
    }
}