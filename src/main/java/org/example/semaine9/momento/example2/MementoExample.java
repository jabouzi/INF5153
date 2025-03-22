package org.example.semaine9.momento.example2;

// Utilisation
public class MementoExample {
    public static void main(String[] args) {
        Radio radio = new Radio();
        History caretaker = new History();

        // Changer la station et sauvegarder l'état
        radio.setStation("98.5 FM");
        caretaker.sauvegarderEtat(radio);

        // Changer la station à nouveau
        radio.setStation("104.3 FM");

        // Restaurer l'état précédent
        caretaker.restaurerEtat(radio); // Station restauree : 98.5 FM
    }
}
