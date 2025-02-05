package org.example.semaine5.patrons.singleton.double_verif;

// Singleton pour gérer une connexion unique à la base de données
class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private String connection;

    private DatabaseConnection() {
        this.connection = "Connected to Fake Database";
    }

    // Advantages:
    //	•	Synchronization happens only during the first creation.
    //	•	After initialization, access is fast.
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public String getConnection() {
        return connection;
    }
}