package org.example.semaine11.unify_interaces.avant;

class Bird implements Animal {
    public void eat() {
        System.out.println("Bird eats seeds");
    }

    public void fly() {
        System.out.println("Bird flies");
    } // Méthode spécifique absente de l'interface
}
