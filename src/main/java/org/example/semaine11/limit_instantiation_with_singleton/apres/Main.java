package org.example.semaine11.limit_instantiation_with_singleton.apres;

// Client
public class Main {
    public static void main(String[] args) {
        // Utilise la même instance
        GestionnaireConnexion.getInstance("DB_Prod").connecter();
        GestionnaireConnexion.getInstance("DB_Prod").connecter(); // Réutilise l'instance
    }
}
