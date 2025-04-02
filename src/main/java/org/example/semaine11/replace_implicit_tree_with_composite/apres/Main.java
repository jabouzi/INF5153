package org.example.semaine11.replace_implicit_tree_with_composite.apres;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création des utilisateurs
        List<User> users = List.of(
                new User("Alice", 30, "alice@example.com", 1.80),
                new User("Bob", 25, "bob@example.com", 1.67)
        );

        // Construction de l'arbre XML avec Composite
        XMLElement root = new XMLElement("users");
        users.forEach(user -> root.add(user.toXMLNode()));

        // Génération du XML final
        System.out.println("XML généré :\n" + root.render());
    }
}