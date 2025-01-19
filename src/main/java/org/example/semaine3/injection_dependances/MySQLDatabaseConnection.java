package org.example.semaine3.injection_dependances;

public class MySQLDatabaseConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connexion à la base de données MySQL établie.");
    }

    @Override
    public void disconnect() {
        System.out.println("Connexion à la base de données MySQL fermée.");
    }

    @Override
    public String executeQuery(String query) {
        System.out.println("Exécution de la requête : " + query);
        return "Résultat simulé pour : " + query;
    }
}
