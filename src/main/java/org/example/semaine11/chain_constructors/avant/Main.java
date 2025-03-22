package org.example.semaine11.chain_constructors.avant;
import org.example.semaine11.chain_constructors.CapitalStrategy;
import java.util.Date;

public class Main {
    public static void main() {
        // Utilisation du premier constructeur secondaire (sans maturity)
        Loan loan1 = new Loan(1000.0f, 500.0f, 3, new Date());

// Utilisation du deuxième constructeur secondaire (avec maturity)
        Loan loan2 = new Loan(2000.0f, 1000.0f, 4, new Date(), new Date());

// Utilisation du constructeur principal (avec une stratégie personnalisée)
        Loan loan3 = new Loan(new CapitalStrategy(), 3000.0f, 1500.0f, 5, new Date(), new Date());
    }
}
