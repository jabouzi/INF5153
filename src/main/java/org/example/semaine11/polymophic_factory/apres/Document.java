package org.example.semaine11.polymophic_factory.apres;

// Hiérarchie refactorisée
abstract class Document {
    public final void generate() {
        prepareHeader();
        createExporter().export();
        addFooter();
    }

    private void prepareHeader() {
        System.out.println("Préparation de l'en-tête standard...");
    }

    private void addFooter() {
        System.out.println("Ajout du pied de page standard...");
    }

    protected abstract Exporter createExporter();
}
