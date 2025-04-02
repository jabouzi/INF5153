package org.example.semaine11.conditionals_with_state.apres;

class ReturnedState implements OrderState {
    @Override
    public void process(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException("Retour impossible déjà retourné ! !");
    }

    @Override
    public String getName() {
        return "RETURNED";
    }
}
