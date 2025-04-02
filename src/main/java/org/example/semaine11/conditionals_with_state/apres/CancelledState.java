package org.example.semaine11.conditionals_with_state.apres;

class CancelledState implements OrderState {
    @Override
    public void process(Order order) {
        System.out.println("[LOG] Commande annulée - traitement ignoré");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("[LOG] Commande déjà annulée");
    }

    @Override
    public String getName() {
        return "CANCELLED";
    }
}
