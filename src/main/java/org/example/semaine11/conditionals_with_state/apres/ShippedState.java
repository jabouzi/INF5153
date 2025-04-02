package org.example.semaine11.conditionals_with_state.apres;

class ShippedState implements OrderState {
    @Override
    public void process(Order order) {
        throw new IllegalStateException("Déjà expédié !");
    }

    @Override
    public void cancel(Order order) {
        order.setState(new ReturnedState());
    }

    @Override
    public String getName() {
        return "SHIPPED";
    }
}
