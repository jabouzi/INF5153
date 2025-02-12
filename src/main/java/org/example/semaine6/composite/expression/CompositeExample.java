package org.example.semaine6.composite.expression;

public class CompositeExample {
    public static void main(String[] args) {
        // Création de l'expression : (2 + 3) * (4 - 1)
        Expression expression = new Operation(
                new Operation(new Nombre(2), new Nombre(3), '+'),
                new Operation(new Nombre(4), new Nombre(1), '-'),
                '*'
        );

        // Évaluation de l'expression
        double resultat = expression.evaluer();
        System.out.println("Résultat : " + resultat); // Affiche "Résultat : 15.0"
    }
}

/*
Résultat : 15.0
 */
