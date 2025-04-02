package org.example.semaine11.polymophic_factory.avant;

class WordDocument extends Document {
    @Override
    void generate() {
        System.out.println("Préparation de l'en-tête Word...");
        System.out.println("Exportation vers Word...");
        System.out.println("Ajout du pied de page Word...");
    }
}
