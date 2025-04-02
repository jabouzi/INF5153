package org.example.semaine11.conditionals_with_state.avant;

class Order {
    private String state = "PENDING";

    public String getState() {
        return state;
    }

    public void process() {
        if (state.equals("PENDING")) {
            state = "PAID";
        } else if (state.equals("PAID")) {
            state = "SHIPPED";
        }
        // Autres états ignorés
    }

    public void cancel() {
        if (state.equals("PENDING")) {
            state = "CANCELLED";
        } else if (state.equals("PAID")) {
            System.out.println("[LOG] Remboursement en cours...");
            state = "CANCELLED";
        }
    }
}
