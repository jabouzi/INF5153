package org.example.heritage.redefinition;

class Animal {
    public void manger() {
        System.out.println("L'animal mange.");
    }
}
        
class Chien extends Animal {
    @Override
    public void manger() {
        System.out.println("Le chien mange.");
    }
}

        

        
