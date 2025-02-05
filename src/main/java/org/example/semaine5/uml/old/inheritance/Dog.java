package org.example.semaine5.uml.old.inheritance;

class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}
