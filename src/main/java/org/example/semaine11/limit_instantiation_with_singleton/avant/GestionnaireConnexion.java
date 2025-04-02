package org.example.semaine11.limit_instantiation_with_singleton.avant;

class GestionnaireConnexion {
    private String config;

    public GestionnaireConnexion(String config) {
        this.config = config;
        System.out.println("Nouvelle instance créée !");
    }

    public void connecter() {
        System.out.println("Connexion avec " + config);
    }
}

