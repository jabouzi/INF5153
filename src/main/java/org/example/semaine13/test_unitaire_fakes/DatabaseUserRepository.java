package org.example.semaine13.test_unitaire_fakes;

import java.util.HashMap;
import java.util.Map;

// Implémentation réelle qui serait utilisée en production
class DatabaseUserRepository implements UserRepository {
    // En production, ceci utiliserait une vraie base de données
    // Pour cet exemple, nous utilisons des collections pour simuler
    private Map<Long, User> usersById = new HashMap<>();
    private Map<String, User> usersByEmail = new HashMap<>();
    private long nextId = 1;

    @Override
    public User findById(long id) {
        System.out.println("Recherche de l'utilisateur avec ID: " + id);
        return usersById.get(id);
    }

    @Override
    public void save(User user) {
        System.out.println("Sauvegarde de l'utilisateur: " + user.getName());

        // Dans un système réel, il y aurait ici une connexion à la BD
        System.out.print("Connexion à la base de données");
        try {
            // Simuler un délai de connexion
            for (int i = 0; i < 5; i++) {
                Thread.sleep(300);
                System.out.print(".");
            }
            System.out.println(" connecté!");

            // Simuler l'insertion dans la BD
            System.out.print("Insertion des données");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(200);
                System.out.print(".");
            }
            System.out.println(" terminé!");

        } catch (InterruptedException e) {
            System.out.println("\nLa connexion a été interrompue!");
            return;
        }

        // Simuler l'auto-incrémentation d'un ID
        if (user.getId() == 0) {
            user.setId(nextId++);
        }

        usersById.put(user.getId(), user);
        usersByEmail.put(user.getEmail(), user);
    }

    @Override
    public boolean exists(String email) {
        System.out.println("Vérification si l'email existe déjà: " + email);

        try {
            // Simuler un léger délai pour la requête
            System.out.print("Recherche dans la base de données");
            for (int i = 0; i < 3; i++) {
                Thread.sleep(200);
                System.out.print(".");
            }
            System.out.println(" terminé!");

        } catch (InterruptedException e) {
            System.out.println("\nLa recherche a été interrompue!");
        }

        return usersByEmail.containsKey(email);
    }
}
