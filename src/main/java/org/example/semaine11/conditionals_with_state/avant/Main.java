package org.example.semaine11.conditionals_with_state.avant;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("État initial: " + order.getState()); // PENDING

        order.process();
        System.out.println("Après process(): " + order.getState()); // PAID

        order.cancel();
        System.out.println("Après cancel(): " + order.getState()); // CANCELLED

        // Tentative de transition invalide
        order.process(); // Ne fait rien (déjà annulé)
        System.out.println("Après process() annulé: " + order.getState()); // CANCELLED
    }
}

