package org.example.semaine11.conditionals_with_state.apres;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println("État initial: " + order.getStateName()); // PENDING

        order.process();
        System.out.println("Après process(): " + order.getStateName()); // PAID

        order.process();
        System.out.println("Après process(): " + order.getStateName()); // SHIPPED

        order.cancel();
        System.out.println("Après process(): " + order.getStateName()); // RETURNED

        order.process();
        System.out.println("Après process(): " + order.getStateName()); // CANCELLED

        order.cancel();
        System.out.println("Après cancel(): " + order.getStateName()); // CANCELLED

        // Tentative de transition invalide
        order.process(); // Lève une exception ou ignore
        System.out.println("Après process() annulé: " + order.getStateName()); // CANCELLED
    }
}

