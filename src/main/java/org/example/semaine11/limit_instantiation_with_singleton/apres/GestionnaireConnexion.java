package org.example.semaine11.limit_instantiation_with_singleton.apres;

class GestionnaireConnexion {
    private static GestionnaireConnexion instance;
    private String config;

    // Constructeur privé
    private GestionnaireConnexion(String config) {
        this.config = config;
    }

    // Méthode de création contrôlée
    public static GestionnaireConnexion getInstance(String config) {
        if (instance == null) {
            instance = new GestionnaireConnexion(config);
            System.out.println("Instance Singleton créée !");
        }
        return instance;
    }

    public void connecter() {
        System.out.println("Connexion avec " + config);
    }
}

