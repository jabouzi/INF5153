package org.example.semaine2.heritage.acces_final_classe;

final class Oiseau {
    public void voler() {
        System.out.println("L'oiseau vole.");
    }
}
        
// public class Aigle extends Oiseau { ... } // Erreur ! La classe "Oiseau" ne peut pas être héritée.
        
class Main {
    public static void main(String[] args) {
        Oiseau oiseau = new Oiseau();
        oiseau.voler();
    }
}
