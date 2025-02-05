package org.example.semaine5.uml.old.dependency;

// Définition : Une classe dépend d’une autre temporairement (sans relation forte comme une association ou une composition).
public class Main {
    public static void main(String[] args) {
        Document doc = new Document("Hello, UML!");
        Printer printer = new Printer();
        printer.print(doc);
    }
}
