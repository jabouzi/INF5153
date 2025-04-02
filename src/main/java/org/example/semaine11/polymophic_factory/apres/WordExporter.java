package org.example.semaine11.polymophic_factory.apres;

class WordExporter implements Exporter {
    @Override
    public void export() {
        System.out.println("Exportation vers Word...");
    }
}
