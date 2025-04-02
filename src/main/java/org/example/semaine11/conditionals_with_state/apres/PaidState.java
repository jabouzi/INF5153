package org.example.semaine11.conditionals_with_state.apres;

class PaidState implements OrderState {
    @Override
    public void process(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("[LOG] Remboursement en cours...");
        order.setState(new CancelledState());
    }

    @Override
    public String getName() {
        return "PAID";
    }
}
