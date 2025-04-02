package org.example.semaine11.replace_implicit_tree_with_composite.avant;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Données à convertir en XML
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 30, "alice@example.com"));
        users.add(new User("Bob", 25, "bob@example.com"));

        // Construction manuelle de l'XML → Problématique !
        String xml = buildUsersXML(users);
        System.out.println("XML généré :\n" + xml);
    }

    // Méthode fragile : construction de l'XML via concaténation de String
    public static String buildUsersXML(List<User> users) {
        StringBuilder xml = new StringBuilder();
        xml.append("<users>");
        for (User user : users) {
            xml.append("<user>")
                    .append("<name>").append(user.getName()).append("</name>")
                    .append("<age>").append(user.getAge()).append("</age>")
                    .append("<email>").append(user.getEmail()).append("</email>")
                    .append("</user>");
        }
        xml.append("</users>");
        return xml.toString();
    }
}

