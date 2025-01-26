package org.example.semaine4.grasp.variations_protegees;

class PaiementPayPal implements PasserellePaiement {
    @Override
    public void traiterPaiement(double montant) {
        System.out.println("Paiement via PayPal traité pour : " + montant + "€");
    }
}
