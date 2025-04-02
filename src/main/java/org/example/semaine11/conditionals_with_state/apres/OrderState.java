package org.example.semaine11.conditionals_with_state.apres;

// Interface State
interface OrderState {
    void process(Order order);

    void cancel(Order order);

    String getName();
}
