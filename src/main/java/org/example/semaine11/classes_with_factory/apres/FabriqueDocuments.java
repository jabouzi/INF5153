package org.example.semaine11.classes_with_factory.apres;

import org.example.semaine11.classes_with_factory.common.Document;

import java.util.Objects;

public class FabriqueDocuments {
    // Méthodes de création
    public static Document creerPDF(String chemin) {
        if (!chemin.endsWith(".pdf")) {
            throw new IllegalArgumentException("Seuls les fichiers .pdf sont autorisés");
        }
        return new DocumentPDFInterne(Objects.requireNonNull(chemin));
    }

    public static Document creerWord(String chemin) {
        if (!chemin.endsWith(".docx")) {
            throw new IllegalArgumentException("Seuls les fichiers .docx sont autorisés");
        }
        return new DocumentWordInterne(Objects.requireNonNull(chemin));
    }

    // Implémentations internes
    private static class DocumentPDFInterne implements Document {
        private final String chemin;
        DocumentPDFInterne(String chemin) { this.chemin = chemin; }
        @Override public void imprimer() {
            System.out.println("Impression PDF (" + chemin + ")");
        }
    }

    private static class DocumentWordInterne implements Document {
        private final String chemin;
        DocumentWordInterne(String chemin) { this.chemin = chemin; }
        @Override public void imprimer() {
            System.out.println("Impression Word (" + chemin + ")");
        }
    }
}
