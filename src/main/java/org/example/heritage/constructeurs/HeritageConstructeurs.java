package org.example.heritage.constructeurs;

// Classe parent :
class Animal {
    String son;
    Animal(String son) {
        this.son = son;
    }
}


// Classe enfant
class Chien extends Animal {
    Chien() {
        super("ouaf");
    }
}
