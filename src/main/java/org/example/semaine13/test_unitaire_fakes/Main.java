package org.example.semaine13.test_unitaire_fakes;

public class Main {
    public static void main(String[] args) {
        // Dans un environnement réel, vous utiliseriez une implémentation réelle
        // du repository, peut-être connecté à une base de données
        UserRepository realRepository = new DatabaseUserRepository();
        UserService userService = new UserService(realRepository);

        // Enregistrement de nouveaux utilisateurs
        System.out.println("Tentative d'enregistrement d'un nouvel utilisateur...");
        boolean result1 = userService.registerUser("Alice Smith", "alice@example.com", "securePwd123");

        if (result1) {
            System.out.println("✅ Utilisateur Alice enregistré avec succès!");
        } else {
            System.out.println("❌ Échec de l'enregistrement de l'utilisateur Alice");
        }

        // Tentative d'enregistrement avec le même email
        System.out.println("\nTentative d'enregistrement avec un email déjà utilisé...");
        boolean result2 = userService.registerUser("Alice Clone", "alice@example.com", "anotherPassword");

        if (result2) {
            System.out.println("✅ Utilisateur Alice Clone enregistré");
        } else {
            System.out.println("❌ Échec de l'enregistrement - Email déjà utilisé");
        }

        // Enregistrement d'un autre utilisateur
        System.out.println("\nTentative d'enregistrement d'un autre utilisateur...");
        boolean result3 = userService.registerUser("Bob Johnson", "bob@example.com", "bobSecure456");

        if (result3) {
            System.out.println("✅ Utilisateur Bob enregistré avec succès!");
        } else {
            System.out.println("❌ Échec de l'enregistrement de l'utilisateur Bob");
        }
    }

}
