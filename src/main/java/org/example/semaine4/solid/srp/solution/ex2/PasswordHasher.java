package org.example.semaine4.solid.srp.solution.ex2;

public class PasswordHasher {
    public String hashPassword(String password) {
        // Exemple fictif de hashage (ne pas utiliser en production)
        return Integer.toHexString(password.hashCode());
    }
}
