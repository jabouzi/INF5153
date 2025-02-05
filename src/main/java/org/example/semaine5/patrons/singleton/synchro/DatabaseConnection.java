package org.example.semaine5.patrons.singleton.synchro;

// Singleton pour gérer une connexion unique à la base de données
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connection;

    private DatabaseConnection() {
        // Simulating a database connection
        this.connection = "Connected to Fake Database";
    }

    // Fixes the issue, but synchronization slows down access.
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getConnection() {
        return connection;
    }
}

