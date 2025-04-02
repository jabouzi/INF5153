package org.example.semaine11.move_accumulation_to_collectng_param.avant;

import org.example.semaine11.move_accumulation_to_collectng_param.common.DonneesFinancieres;

import java.time.LocalDate;

public class RapportFinancier {
    public String genererRapport(DonneesFinancieres donnees) {
        String resultat = "";

        // 1. Entête
        resultat += "=== RAPPORT FINANCIER ===\n";
        resultat += "Date: " + LocalDate.now() + "\n";

        // 2. Corps
        resultat += "Revenus: " + donnees.getRevenus() + "\n";
        resultat += "Dépenses: " + donnees.getDepenses() + "\n";

        // 3. Conclusion
        resultat += "Bénéfice: " + (donnees.getRevenus() - donnees.getDepenses()) + "\n";

        return resultat;
    }
}
