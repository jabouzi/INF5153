package org.example.semaine11.chain_constructors.apres;

import org.example.semaine11.common.CapitalStrategy;
import org.example.semaine11.common.RevolvingTermROC;
import org.example.semaine11.common.TermROC;

import java.util.Date;

public class Loan {
    private CapitalStrategy strategy;
    private float notional;
    private float outstanding;
    private int rating;
    private Date expiry;
    private Date maturity;

    // Constructeur principal (le plus complet)
    public Loan(CapitalStrategy strategy, float notional, float outstanding, int rating, Date expiry, Date maturity) {
        this.strategy = strategy;
        this.notional = notional;
        this.outstanding = outstanding;
        this.rating = rating;
        this.expiry = expiry;
        this.maturity = maturity;
    }

    // Constructeur secondaire 1 : sans maturity, utilise une stratégie par défaut (TermROC)
    public Loan(float notional, float outstanding, int rating, Date expiry) {
        this(new TermROC(), notional, outstanding, rating, expiry, null); // Appel du constructeur principal
    }

    // Constructeur secondaire 2 : avec maturity, utilise une autre stratégie par défaut (RevolvingTermROC)
    public Loan(float notional, float outstanding, int rating, Date expiry, Date maturity) {
        this(new RevolvingTermROC(), notional, outstanding, rating, expiry, maturity); // Appel du constructeur principal
    }
}
