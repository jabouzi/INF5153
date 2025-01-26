package org.example.semaine4.grasp.variations_protegees;

class PanierAchat {
    private PasserellePaiement passerellePaiement;

    public void setPasserellePaiement(PasserellePaiement passerelle) {
        this.passerellePaiement = passerelle;
    }

    public void validerPaiement(double montant) {
        passerellePaiement.traiterPaiement(montant);
    }
}
