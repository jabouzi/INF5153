package org.example.semaine3.injection_dependances;

public interface DatabaseConnection {
    void connect();
    void disconnect();
    String executeQuery(String query);
}
