package org.example.semaine5.patrons.singleton;

// Programme principal
public class SingletonDatabaseExample {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        System.out.println(db1);
        System.out.println(db2);

        // Vérification que c'est bien la même instance
        System.out.println(db1 == db2); // Affiche "true"
    }
}
