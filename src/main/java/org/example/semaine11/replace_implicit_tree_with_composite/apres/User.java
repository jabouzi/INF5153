package org.example.semaine11.replace_implicit_tree_with_composite.apres;

// Classe métier User
class User {
    private String name;
    private int age;
    private String email;
    private Double taille;

    public User(String name, int age, String email, Double taille) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.taille = taille;
    }

    // Convertit un User en structure XMLNode
    public XMLNode toXMLNode() {
        XMLElement userElement = new XMLElement("user");
        userElement.add(new XMLElement("name").add(new XMLText(this.name)));
        userElement.add(new XMLElement("age").add(new XMLText(String.valueOf(this.age))));
        userElement.add(new XMLElement("email").add(new XMLText(this.email)));
        userElement.add(new XMLElement("taille").add(new XMLText(String.valueOf(this.taille))));
        return userElement;
    }
}