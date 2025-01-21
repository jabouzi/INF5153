package org.example.semaine3.injection_dependances;

public class Main {
    public static void main(String[] args) {

        // Création de la connexion à la base de données
        DatabaseConnection mySQLConnection = new MySQLDatabaseConnection();

        UserModel userModel = new UserModel();
        // Injection de la connexion dans le modèle
        UserModel1 userModel1 = new UserModel1(mySQLConnection);

        // Utilisation du modèle pour exécuter des requêtes
        userModel.afficherUtilisateurs();
        userModel1.afficherUtilisateurs();

/*
        Vous pouvez remplacer MySQLDatabaseConnection par une autre implémentation
        (par exemple, PostgreSQLDatabaseConnection) sans modifier UserModel.
*/
    }
}
