package org.example.semaine11.polymophic_factory.apres;

class PDFDocument extends Document {
    @Override
    protected Exporter createExporter() {
        return new PDFExporter();
    }
}
