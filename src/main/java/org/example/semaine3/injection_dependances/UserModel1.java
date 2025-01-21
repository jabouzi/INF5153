package org.example.semaine3.injection_dependances;

public class UserModel1 {
    private final DatabaseConnection databaseConnection;

    // Injection de la dépendance via le constructeur
    public UserModel1(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void afficherUtilisateurs() {
        databaseConnection.connect();
        String result = databaseConnection.executeQuery("SELECT * FROM utilisateurs");
        System.out.println(result);
        databaseConnection.disconnect();
    }
}
