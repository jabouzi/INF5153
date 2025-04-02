package org.example.semaine11.move_accumulation_to_collectng_param.apres;

import org.example.semaine11.move_accumulation_to_collectng_param.common.DonneesFinancieres;

import java.time.LocalDate;

public class RapportFinancierRefactored {
    public String genererRapport(DonneesFinancieres donnees) {
        StringBuilder resultat = new StringBuilder();
        ajouterEntete(resultat);
        ajouterCorps(resultat, donnees);
        ajouterConclusion(resultat, donnees);
        return resultat.toString();
    }

    private void ajouterEntete(StringBuilder sb) {
        sb.append("=== RAPPORT FINANCIER ===\n")
                .append("Date: ").append(LocalDate.now()).append("\n");
    }

    private void ajouterCorps(StringBuilder sb, DonneesFinancieres donnees) {
        sb.append("Revenus: ").append(donnees.getRevenus()).append("\n")
                .append("Dépenses: ").append(donnees.getDepenses()).append("\n");
    }

    private void ajouterConclusion(StringBuilder sb, DonneesFinancieres donnees) {
        sb.append("Bénéfice: ")
                .append(donnees.getRevenus() - donnees.getDepenses()).append("\n");
    }
}
