package org.example.heritage.interfaces;

interface Volant {
    void voler();
}
        
interface Nageur {
    void nager();
}
        
class Canard implements Volant, Nageur {
    @Override
    public void voler() {
        System.out.println("Le canard vole dans le ciel.");
    }
            
    @Override
    public void nager() {
        System.out.println("Le canard nage dans l'eau.");
    }
}
        
class Main {
    public static void main(String[] args) {
        Canard canard = new Canard();

        canard.voler();
        canard.nager();
    }
}

        
