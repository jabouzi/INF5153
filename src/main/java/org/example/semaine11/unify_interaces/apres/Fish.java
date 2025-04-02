package org.example.semaine11.unify_interaces.apres;

class Fish implements Animal {
    public void eat() {
        System.out.println("Fish eats plankton");
    }

    public void fly() {
        throw new UnsupportedOperationException("Fish can't fly!");
    } // Comportement par défaut
}
