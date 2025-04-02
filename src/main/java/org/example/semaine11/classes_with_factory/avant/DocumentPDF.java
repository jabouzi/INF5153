package org.example.semaine11.classes_with_factory.avant;

import org.example.semaine11.classes_with_factory.common.Document;

// Implémentations (constructeurs publics)
public class DocumentPDF implements Document {
    public DocumentPDF(String chemin) { /* ... */ }

    public void imprimer() {
        System.out.println("Impression PDF");
    }
}
