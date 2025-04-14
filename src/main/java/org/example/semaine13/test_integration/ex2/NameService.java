package org.example.semaine13.test_integration.ex2;

public class NameService {
    public String processName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom ne peut pas être vide");
        }
        return name.toUpperCase();
    }
}
