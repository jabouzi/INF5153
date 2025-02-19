package org.example.semaine7.interpreter.example2;

// ExpressionNonTerminale : Représente une répétition de notes
class RepetitionMusicale implements ExpressionMusicale {
    private ExpressionMusicale expression;
    private int repetitions;

    public RepetitionMusicale(ExpressionMusicale expression, int repetitions) {
        this.expression = expression;
        this.repetitions = repetitions;
    }

    @Override
    public void interpreter(ContexteMusical contexte) {
        for (int i = 0; i < repetitions; i++) {
            expression.interpreter(contexte);
        }
    }
}
