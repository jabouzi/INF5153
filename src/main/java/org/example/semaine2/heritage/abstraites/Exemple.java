package org.example.semaine2.heritage.abstraites;

abstract class Animal {
    protected String nom;
            
    public Animal(String nom) {
        this.nom = nom;
    }
            
    public void manger() {
        System.out.println(nom + " mange.");
    }
            
    // Méthode abstraite : pas d'implémentation
    public abstract void emettreSon();
}
        
class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }
            
    @Override
    public void emettreSon() {
        System.out.println(nom + " aboie !");
    }
}
        
class Chat extends Animal {
    public Chat(String nom) {
        super(nom);
    }
            
    @Override
    public void emettreSon() {
        System.out.println(nom + " miaule !");
    }
}
        
class Main {
    public static void main(String[] args) {
        Animal chien = new Chien("Rex");
        Animal chat = new Chat("Mina");

        chien.manger();
        chien.emettreSon();

        chat.manger();
        chat.emettreSon();
    }
}

        
