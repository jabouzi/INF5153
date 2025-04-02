package org.example.semaine11.polymophic_factory.apres;

public class Main {
    public static void main(String[] args) {
        Document pdfDoc = new PDFDocument();
        Document wordDoc = new WordDocument();

        System.out.println("\n=== APRÈS Refactoring ===");
        pdfDoc.generate();
        wordDoc.generate();
    }
}

