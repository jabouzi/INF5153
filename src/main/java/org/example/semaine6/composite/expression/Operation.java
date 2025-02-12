package org.example.semaine6.composite.expression;

class Operation implements Expression {
    private Expression gauche;
    private Expression droite;
    private char operateur;

    public Operation(Expression gauche, Expression droite, char operateur) {
        this.gauche = gauche;
        this.droite = droite;
        this.operateur = operateur;
    }

    @Override
    public double evaluer() {
        switch (operateur) {
            case '+': return gauche.evaluer() + droite.evaluer();
            case '-': return gauche.evaluer() - droite.evaluer();
            case '*': return gauche.evaluer() * droite.evaluer();
            case '/': return gauche.evaluer() / droite.evaluer();
            default: throw new IllegalArgumentException("Opérateur inconnu");
        }
    }
}
