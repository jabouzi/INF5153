package org.example.semaine11.move_accumulation_to_collectng_param.common;

import org.example.semaine11.move_accumulation_to_collectng_param.apres.RapportFinancierRefactored;
import org.example.semaine11.move_accumulation_to_collectng_param.avant.RapportFinancier;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DonneesFinancieres donnees = new DonneesFinancieres(5000, 3000);

        // AVANT
        System.out.println("=== AVANT ===");
        System.out.println(new RapportFinancier().genererRapport(donnees));

        // APRÈS
        System.out.println("\n=== APRÈS ===");
        System.out.println(new RapportFinancierRefactored().genererRapport(donnees));
    }
}

