package org.example.semaine11.polymophic_factory.apres;

class WordDocument extends Document {
    @Override
    protected Exporter createExporter() {
        return new WordExporter();
    }
}
