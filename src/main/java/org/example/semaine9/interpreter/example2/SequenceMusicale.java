package org.example.semaine9.interpreter.example2;

import java.util.ArrayList;
import java.util.List;

// ExpressionNonTerminale : Représente une séquence de notes (partition)
class SequenceMusicale implements ExpressionMusicale {
    private List<ExpressionMusicale> expressions = new ArrayList<>();

    public void ajouterExpression(ExpressionMusicale expression) {
        expressions.add(expression);
    }

    @Override
    public void interpreter(ContexteMusical contexte) {
        for (ExpressionMusicale expression : expressions) {
            expression.interpreter(contexte);
        }
    }
}
