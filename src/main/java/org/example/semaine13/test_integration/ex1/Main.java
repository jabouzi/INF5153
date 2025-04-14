package org.example.semaine13.test_integration.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // 1. Connexion à la base SQLite (fichier physique cette fois)
        String dbPath = "testdb.sqlite"; // Base créée dans le répertoire du projet
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:" + dbPath)) {

            // 2. Initialisation du repository
            UserRepository repository = new UserRepository(connection);
            repository.createTable();

            // 3. Insertion de données
            repository.insertUser("Alice");
            repository.insertUser("Bob");
            System.out.println("Utilisateurs insérés avec succès.");

            // 4. Récupération des données
            System.out.println("Liste des utilisateurs :");
            repository.getAllUsers().forEach(System.out::println);

        } catch (SQLException e) {
            System.err.println("Erreur base de données : " + e.getMessage());
        }
    }
}
