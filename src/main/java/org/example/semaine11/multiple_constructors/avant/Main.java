package org.example.semaine11.multiple_constructors.avant;

import org.example.semaine11.common.CapitalStrategy;
import org.example.semaine11.common.RevolverCapitalStrategy;
import org.example.semaine11.common.TermCapitalStrategy;

import java.util.Date;

public class Main {
    public static void main() {
        // Création d'un Term Loan sans stratégie personnalisée
        // Création d'un Term Loan sans expiry
        Loan termLoan1 = new Loan(1000.0, 5, new Date());

// Création d'un Term Loan avec expiry
        Loan termLoan2 = new Loan(2000.0, 4, new Date(), new Date());

// Création d'un Term Loan avec outstanding
        Loan termLoan3 = new Loan(3000.0, 500.0, 3, new Date(), new Date());

// Création d'un Term Loan avec stratégie personnalisée (sans outstanding)
        Loan customTermLoan1 = new Loan(new TermCapitalStrategy(), 4000.0, 2, new Date(), new Date());

// Création d'un Term Loan avec stratégie personnalisée et outstanding
        Loan customTermLoan2 = new Loan(new RevolverCapitalStrategy(), 5000.0, 1000.0, 1, new Date(), new Date());
    }
}
