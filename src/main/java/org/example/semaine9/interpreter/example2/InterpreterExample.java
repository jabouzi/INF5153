package org.example.semaine9.interpreter.example2;

// Utilisation
public class InterpreterExample {
    public static void main(String[] args) {
        // Création du contexte
        ContexteMusical contexte = new ContexteMusical("Do majeur");

        // Création des expressions terminales (notes)
        ExpressionMusicale noteDo = new NoteMusicale("Do");
        ExpressionMusicale noteRe = new NoteMusicale("Re");
        ExpressionMusicale noteMi = new NoteMusicale("Mi");

        // Création d'une séquence musicale
        SequenceMusicale sequence = new SequenceMusicale();
        sequence.ajouterExpression(noteDo);
        sequence.ajouterExpression(noteRe);
        sequence.ajouterExpression(noteMi);

        // Création d'une répétition musicale
        RepetitionMusicale repetition = new RepetitionMusicale(sequence, 2);

        // Interprétation de la partition
        repetition.interpreter(contexte);
    }
}
