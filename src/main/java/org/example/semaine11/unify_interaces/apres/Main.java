package org.example.semaine11.unify_interaces.apres;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Bird(), new Fish() };
        for (Animal a : animals) {
            a.eat();
            if (a instanceof Bird) a.fly(); // Vérification de type optionnelle
        }
    }
}
