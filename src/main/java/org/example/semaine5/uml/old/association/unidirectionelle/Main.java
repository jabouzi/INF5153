package org.example.semaine5.uml.old.association.unidirectionelle;

// Définition :
// Une relation entre deux classes où une instance d’une classe est liée à une ou plusieurs instances d’une autre classe.
// •Directionnelle : Une classe connaît l’autre, mais pas l’inverse.
// •Bidirectionnelle : Les deux classes se connaissent.
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S");
        Person person = new Person("Skander", myCar);
        person.showCar();
    }
}
