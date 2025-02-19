package org.example.semaine7.command.example2;

class Serveuse {
    private Commande commande;

    public void prendreCommande(Commande commande) {
        this.commande = commande;
    }

    public void passerCommande() {
        if (commande != null) {
            commande.executer();
        }
    }

    public void annulerCommande() {
        if (commande != null) {
            commande.annuler();
        }
    }
}
