package org.example.semaine5.uml.dependence;

public class DependenceExample {
    public static void main(String[] args) {
        Document doc = new Document("Hello, UML!");
        Imprimente imprimente = new Imprimente();
        imprimente.imprimer(doc);
    }
}
