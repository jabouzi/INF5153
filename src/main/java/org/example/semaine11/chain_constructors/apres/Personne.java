package org.example.semaine11.chain_constructors.apres;

public class Personne {
    private String nom;
    private int age;

    // Constructeur principal
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Constructeur secondaire qui appelle le constructeur principal
    public Personne(String nom) {
        this(nom, 0); // Appel du constructeur principal avec une valeur par défaut
    }
}
