package org.example.semaine11.classes_with_factory.avant;

import org.example.semaine11.classes_with_factory.common.Document;

public class DocumentWord implements Document {
    public DocumentWord(String chemin) { /* ... */ }

    public void imprimer() {
        System.out.println("Impression Word");
    }
}
