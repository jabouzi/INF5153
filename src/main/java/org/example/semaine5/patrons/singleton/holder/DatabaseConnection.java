package org.example.semaine5.patrons.singleton.holder;

// Singleton pour gérer une connexion unique à la base de données
class DatabaseConnection {
    private String connection;

    private DatabaseConnection() {
        this.connection = "Connected to Fake Database";
    }

    // Why is this the best approach?
    //	•	Instance is only created when first accessed (lazy initialization).
    //	•	Thread-safe without explicit synchronization, thanks to JVM class loading.
    //	•	Best performance.
    private static class Holder {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return Holder.INSTANCE;
    }

    public String getConnection() {
        return connection;
    }
}