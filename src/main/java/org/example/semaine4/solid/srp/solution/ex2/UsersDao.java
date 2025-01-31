package org.example.semaine4.solid.srp.solution.ex2;

public class UsersDao {
    public boolean userExists(String username, String hashedPassword) {
        // Simuler la recherche dans une base de données
        return username.equals("admin") && hashedPassword.equals("5d41402abc4b2a76b9719d911017c592");
    }
}
