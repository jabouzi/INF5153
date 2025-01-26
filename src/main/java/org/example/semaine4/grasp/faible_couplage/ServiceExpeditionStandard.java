package org.example.semaine4.grasp.faible_couplage;

class ServiceExpeditionStandard implements ServiceExpedition {
    @Override
    public void expedier(Commande commande) {
        System.out.println("Commande expédiée via le service standard.");
    }
}
