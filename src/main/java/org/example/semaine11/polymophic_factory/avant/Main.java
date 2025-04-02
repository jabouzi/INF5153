package org.example.semaine11.polymophic_factory.avant;

public class Main {
    public static void main(String[] args) {
        Document pdfDoc = new PDFDocument();
        Document wordDoc = new WordDocument();

        System.out.println("=== AVANT Refactoring ===");
        pdfDoc.generate();
        wordDoc.generate();
    }
}

