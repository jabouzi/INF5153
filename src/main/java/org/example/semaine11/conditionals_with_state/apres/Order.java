package org.example.semaine11.conditionals_with_state.apres;

// Context (Order)
class Order {
    private OrderState state = new PendingState();

    public void setState(OrderState state) {
        this.state = state;
    }

    public String getStateName() {
        return state.getName();
    }

    public void process() {
        state.process(this);
    }

    public void cancel() {
        state.cancel(this);
    }
}
