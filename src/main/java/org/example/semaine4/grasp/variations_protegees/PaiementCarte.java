package org.example.semaine4.grasp.variations_protegees;

class PaiementCarte implements PasserellePaiement {
    @Override
    public void traiterPaiement(double montant) {
        System.out.println("Paiement par carte traité pour : " + montant + "€");
    }
}
