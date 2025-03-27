package org.example.semaine11.multiple_constructors.apres;

import org.example.semaine11.common.CapitalStrategy;
import org.example.semaine11.common.RCTLCapitalStrategy;
import org.example.semaine11.common.RevolverCapitalStrategy;
import org.example.semaine11.common.TermCapitalStrategy;

import java.util.Date;

public class Main {
    public static void main() {
        // Création d'un Term Loan sans stratégie personnalisée
        Loan termLoan = Loan.createTermLoan(1000.0, 5, new Date());

// Création d'un Term Loan avec stratégie personnalisée
        Loan customTermLoan = Loan.createTermLoan(new TermCapitalStrategy(), 2000.0, 500.0, 4, new Date());

// Création d'un Revolver sans stratégie personnalisée
        Loan revolver = Loan.createRevolver(3000.0, 1000.0, 3, new Date());

// Création d'un Revolver avec stratégie personnalisée
        Loan customRevolver = Loan.createRevolver(new RevolverCapitalStrategy(), 4000.0, 1500.0, 2, new Date());

// Création d'un RCTL sans stratégie personnalisée
        Loan rctl = Loan.createRCTL(5000.0, 2000.0, 1, new Date(), new Date());

// Création d'un RCTL avec stratégie personnalisée
        Loan customRCTL = Loan.createRCTL(new RCTLCapitalStrategy(), 6000.0, 2500.0, 0, new Date(), new Date());
    }
}
