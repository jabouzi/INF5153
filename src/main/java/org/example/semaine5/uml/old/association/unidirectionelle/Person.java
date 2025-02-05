package org.example.semaine5.uml.old.association.unidirectionelle;

class Person {
    private String name;
    private Car car; // Association avec Car

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void showCar() {
        System.out.println(name + " owns a " + car.getModel());
    }
}
