package org.example.semaine11.conditionals_with_state.apres;

// États concrets
class PendingState implements OrderState {
    @Override
    public void process(Order order) {
        order.setState(new PaidState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getName() {
        return "PENDING";
    }
}
