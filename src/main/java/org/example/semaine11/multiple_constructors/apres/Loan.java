package org.example.semaine11.multiple_constructors.apres;

import org.example.semaine11.common.CapitalStrategy;
import org.example.semaine11.common.RCTLStrategy;
import org.example.semaine11.common.RevolvingTermROC;
import org.example.semaine11.common.TermROC;

import java.util.Date;

public class Loan {
    private CapitalStrategy capitalStrategy;
    private double notional;
    private double outstanding;
    private int customerRating;
    private Date expiry;
    private Date maturity;

    // Constructeur privé pour empêcher l'instanciation directe
    private Loan(CapitalStrategy capitalStrategy, double notional, double outstanding, int customerRating, Date expiry, Date maturity) {
        this.capitalStrategy = capitalStrategy;
        this.notional = notional;
        this.outstanding = outstanding;
        this.customerRating = customerRating;
        this.expiry = expiry;
        this.maturity = maturity;
    }

    // Méthode de création 1 : Term Loan sans stratégie personnalisée
    public static Loan createTermLoan(double notional, int customerRating, Date maturity) {
        return new Loan(new TermROC(), notional, 0.0, customerRating, null, maturity);
    }

    // Méthode de création 2 : Term Loan avec stratégie personnalisée
    public static Loan createTermLoan(CapitalStrategy capitalStrategy, double notional, double outstanding, int customerRating, Date maturity) {
        return new Loan(capitalStrategy, notional, outstanding, customerRating, null, maturity);
    }

    // Méthode de création 3 : Revolver sans stratégie personnalisée
    public static Loan createRevolver(double notional, double outstanding, int customerRating, Date expiry) {
        return new Loan(new RevolvingTermROC(), notional, outstanding, customerRating, expiry, null);
    }

    // Méthode de création 4 : Revolver avec stratégie personnalisée
    public static Loan createRevolver(CapitalStrategy capitalStrategy, double notional, double outstanding, int customerRating, Date expiry) {
        return new Loan(capitalStrategy, notional, outstanding, customerRating, expiry, null);
    }

    // Méthode de création 5 : RCTL (Revolving Credit Term Loan) sans stratégie personnalisée
    public static Loan createRCTL(double notional, double outstanding, int customerRating, Date maturity, Date expiry) {
        return new Loan(new RCTLStrategy(), notional, outstanding, customerRating, expiry, maturity);
    }

    // Méthode de création 6 : RCTL avec stratégie personnalisée
    public static Loan createRCTL(CapitalStrategy capitalStrategy, double notional, double outstanding, int customerRating, Date maturity, Date expiry) {
        return new Loan(capitalStrategy, notional, outstanding, customerRating, expiry, maturity);
    }
}
