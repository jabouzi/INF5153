package org.example.semaine7.interpreter.example1;

// NumberExpression: Gère les nombres constants
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret(Context context) {
        return number;
    }
}
