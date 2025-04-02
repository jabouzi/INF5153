package org.example.semaine11.limit_instantiation_with_singleton.avant;

// Client
public class Main {
    public static void main(String[] args) {
        // Crée plusieurs instances identiques
        new GestionnaireConnexion("DB_Prod").connecter();
        new GestionnaireConnexion("DB_Prod").connecter(); // Instanciation redondante
    }
}
