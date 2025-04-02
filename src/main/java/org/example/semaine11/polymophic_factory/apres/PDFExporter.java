package org.example.semaine11.polymophic_factory.apres;

// Implémentations
class PDFExporter implements Exporter {
    @Override
    public void export() {
        System.out.println("Création du rendu PDF...");
    }
}
