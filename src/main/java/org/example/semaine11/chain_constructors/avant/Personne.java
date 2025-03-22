package org.example.semaine11.chain_constructors.avant;

public class Personne {
    private String nom;
    private int age;

    // Constructeur 1
    public Personne(String nom) {
        this.nom = nom;
        this.age = 0; // Valeur par défaut
    }

    // Constructeur 2
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
}
