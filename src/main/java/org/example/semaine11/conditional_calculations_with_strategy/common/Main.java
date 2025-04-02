package org.example.semaine11.conditional_calculations_with_strategy.common;

import org.example.semaine11.conditional_calculations_with_strategy.apres.CalculateurTaxe;
import org.example.semaine11.conditional_calculations_with_strategy.apres.TaxeFR;
import org.example.semaine11.conditional_calculations_with_strategy.apres.TaxeUS;
import org.example.semaine11.conditional_calculations_with_strategy.avant.CalculateurTaxeOld;

public class Main {
    public static void main(String[] args) {
        // AVANT : Approche conditionnelle
        CalculateurTaxeOld calculateurOld = new CalculateurTaxeOld();
        System.out.println("AVANT - Taxe FR: " + calculateurOld.calculer("FR", 100)); // 20.0
        System.out.println("AVANT - Taxe US: " + calculateurOld.calculer("US", 100)); // 20.0

        // APRÈS : Approche Strategy
        CalculateurTaxe calculateurFR = new CalculateurTaxe(new TaxeFR());
        CalculateurTaxe calculateurUS = new CalculateurTaxe(new TaxeUS());

        System.out.println("APRÈS - Taxe FR: " + calculateurFR.calculer(100)); // 20.0
        System.out.println("APRÈS - Taxe US: " + calculateurUS.calculer(100)); // 8.0

        // Changement dynamique de stratégie
        CalculateurTaxe calculateur = new CalculateurTaxe(new TaxeFR());
        System.out.println("Initial (FR): " + calculateur.calculer(100)); // 20.0

        calculateur.setStrategie(new TaxeUS());
        System.out.println("Après changement (US): " + calculateur.calculer(100)); // 8.0
    }
}

