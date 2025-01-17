package org.example.heritage.masquage;

class Parent {
    public String nom = "Parent";
}
        
class Enfant extends Parent {
    public String nom = "Enfant"; // Masquage du membre 'nom' du parent
}
        
class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Enfant enfant = new Enfant();
        Parent parentEnfant = new Enfant();

        System.out.println("Nom (parent) : " + parent.nom); // Accède au membre de Parent
        System.out.println("Nom (enfant) : " + enfant.nom); // Accède au membre de Enfant
        System.out.println("Nom (parentEnfant) : " + parentEnfant.nom); // Accède au membre de Parent
    }
}
