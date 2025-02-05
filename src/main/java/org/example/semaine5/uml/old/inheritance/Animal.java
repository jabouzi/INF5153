package org.example.semaine5.uml.old.inheritance;

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

