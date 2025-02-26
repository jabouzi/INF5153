package org.example.semaine3.injection_dependances;

public class UserModel {
    private final DatabaseConnection databaseConnection = new MySQLDatabaseConnection();

    public UserModel() { }

    public void afficherUtilisateurs() {
        databaseConnection.connect();
        String result = databaseConnection.executeQuery("SELECT * FROM utilisateurs");
        System.out.println(result);
        databaseConnection.disconnect();
    }
}
