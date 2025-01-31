package org.example.semaine4.solid.ocp.solution;

import org.example.semaine4.solid.ocp.violation.TypeEmploye;

// Classe principale respectant OCP
public class CalculateurDeSalaire {

    public double calculerSalaire(TypeEmploye typeEmploye, double salaire) {
        CalculateurDeTaxes calculateur = CalculateurDeTaxes.obtenirCalculateur(typeEmploye);
        double taxe = calculateur.calculerTaxe(salaire);
        return salaire - taxe;
    }
}
