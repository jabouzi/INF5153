package org.example.semaine11.unify_interaces.avant;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.eat();
        //bird.fly(); // Erreur de compilation : fly() n'existe pas dans Animal
    }
}
