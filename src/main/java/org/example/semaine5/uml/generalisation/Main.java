package org.example.semaine5.uml.generalisation;

// Main
public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.manger(); // Hérité de Animal
        chien.aboyer(); // Spécifique à Chien

        Chat chat = new Chat();
        chat.dormir(); // Hérité de Animal
        chat.miauler(); // Spécifique à Chat
    }
}
