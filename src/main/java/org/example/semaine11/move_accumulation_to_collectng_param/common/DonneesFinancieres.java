package org.example.semaine11.move_accumulation_to_collectng_param.common;

// Modèle de données
public class DonneesFinancieres {
    private final double revenus;
    private final double depenses;

    public DonneesFinancieres(double revenus, double depenses) {
        this.revenus = revenus;
        this.depenses = depenses;
    }

    public double getRevenus() {
        return revenus;
    }

    public double getDepenses() {
        return depenses;
    }

    // Getters...
}
