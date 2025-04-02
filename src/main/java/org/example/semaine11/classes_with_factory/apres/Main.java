package org.example.semaine11.classes_with_factory.apres;

import org.example.semaine11.classes_with_factory.common.Document;

public class Main {
    public static void main(String[] args) {
        // Création de documents via la Fabrique
        Document rapport = FabriqueDocuments.creerPDF("rapport_annuel.pdf");
        Document contrat = FabriqueDocuments.creerWord("contrat.docx");

        // Utilisation des documents
        System.out.println("=== Impression des documents ===");
        rapport.imprimer();  // Output: Impression PDF
        contrat.imprimer();  // Output: Impression Word

        // Test avec un chemin invalide (exemple de validation)
        try {
            Document docInvalide = FabriqueDocuments.creerPDF("rapport.txt"); // Extension non supportée
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage()); // Output: Erreur: Seuls les fichiers .pdf sont autorisés
        }
    }
}
