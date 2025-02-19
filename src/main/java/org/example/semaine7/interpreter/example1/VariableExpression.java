package org.example.semaine7.interpreter.example1;

// VariableExpression: Gère les variables du contexte
class VariableExpression implements Expression {
    private String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariable(name);
    }
}
