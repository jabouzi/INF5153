package org.example.semaine11.classes_with_factory.avant;

import org.example.semaine11.classes_with_factory.common.Document;

// Client (instanciation directe problématique)
public class Main {
    public static void main(String[] args) {
        Document rapport = new DocumentPDF("rapport.pdf");  // Couplage fort
        rapport.imprimer();
        Document contrat = new DocumentWord("contrat.word");  // Couplage fort
        contrat.imprimer();
    }
}
