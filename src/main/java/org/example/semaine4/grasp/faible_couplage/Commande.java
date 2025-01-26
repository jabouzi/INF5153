package org.example.semaine4.grasp.faible_couplage;

class Commande {
    private ServiceExpedition serviceExpedition;

    public void setServiceExpedition(ServiceExpedition serviceExpedition) {
        this.serviceExpedition = serviceExpedition;
    }

    public void traiterCommande() {
        serviceExpedition.expedier(this);
    }
}
