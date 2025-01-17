package org.example.heritage.acces_final_methode;

class Animal {
    public final void respirer() {
        System.out.println("L'animal respire.");
    }
}
        
class Chien extends Animal {
    // public void respirer() { ... } // Erreur ! La méthode ne peut pas être redéfinie.
    public void aboyer() {
        System.out.println("Le chien aboie.");
    }
}
        
class Main {
    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.respirer(); // Appelle la méthode final de la classe parent
        chien.aboyer();
    }
}

        
