package org.example.semaine11.polymophic_factory.avant;

class PDFDocument extends Document {
    @Override
    void generate() {
        System.out.println("Préparation de l'en-tête PDF...");
        System.out.println("Création du rendu PDF...");
        System.out.println("Ajout du pied de page PDF...");
    }
}
