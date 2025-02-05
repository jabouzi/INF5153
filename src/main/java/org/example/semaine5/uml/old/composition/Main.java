package org.example.semaine5.uml.old.composition;

// Définition : Une relation “tout/partie” où la partie ne peut pas exister sans le tout.
// Si le tout est supprimé, les parties le sont aussi.
public class Main {
    public static void main(String[] args) {
        House house = new House("1234 Maple St");
        house.showRooms();
    }
}
