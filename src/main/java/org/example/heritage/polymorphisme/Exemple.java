package org.example.heritage.polymorphisme;

class Animal {
    public void salutation() {
        System.out.println("L'animal vous salue.");
    }
}
        
class Chat extends Animal {
    public void salutation() {
        System.out.println("Le chat miaule.");
    }
}
        
class MainClass {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal chat1 = new Chat();
        animal1.salutation(); // Affiche "L'animal vous salue."
        chat1.salutation();   // Affiche "Le chat miaule."
    }
}
