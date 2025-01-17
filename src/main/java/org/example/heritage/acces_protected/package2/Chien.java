package org.example.heritage.acces_protected.package2;

import org.example.heritage.acces_protected.package1.Animal;

public class Chien extends Animal {
    public Chien(String nom) {
        this.nom = nom; // Accessible grâce à "protected"
    }
            
    public void aboyer() {
        System.out.println(nom + " aboie !");
    }
}

class Main {
    public static void main(String[] args) {
        Chien chien = new Chien("Rex");
        chien.afficherNom(); // Fonctionne grâce à "protected"
        chien.aboyer();
    }
}
        
