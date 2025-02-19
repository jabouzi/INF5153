package org.example.semaine7.interpreter.example1;

import java.util.*;

// Interpreter: Gère l'interprétation des expressions
class Interpreter {
    private final Context context;

    public Interpreter(Context context) {
        this.context = context;
    }

    public int interpret(String expression) {
        Expression expressionTree = buildExpressionTree(expression);
        return expressionTree.interpret(context);
    }

    // 🛠️ Convertit une expression infixée en arbre d'expression
    private Expression buildExpressionTree(String expression) {
        Queue<String> postfixTokens = convertToPostfix(tokenize(expression));
        return buildExpressionFromPostfix(postfixTokens);
    }

    // 🛠️ Tokenisation de l'expression
    private Queue<String> tokenize(String expression) {
        Queue<String> tokens = new LinkedList<>();
        StringTokenizer tokenizer = new StringTokenizer(expression, " +-*()", true);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            if (!token.isEmpty()) {
                tokens.add(token);
            }
        }
        return tokens;
    }

    // 🛠️ Conversion Infixe → Postfixée (Shunting Yard Algorithm)
    private Queue<String> convertToPostfix(Queue<String> tokens) {
        Queue<String> output = new LinkedList<>();
        Stack<String> operators = new Stack<>();

        Map<String, Integer> precedence = Map.of("+", 1, "*", 2);

        while (!tokens.isEmpty()) {
            String token = tokens.poll();

            if (token.matches("-?\\d+")) { // Nombre
                output.add(token);
            } else if (token.matches("[a-zA-Z]+")) { // Variable
                output.add(token);
            } else if (token.equals("+") || token.equals("*")) { // Opérateurs
                while (!operators.isEmpty() && precedence.getOrDefault(operators.peek(), 0) >= precedence.get(token)) {
                    output.add(operators.pop());
                }
                operators.push(token);
            } else if (token.equals("(")) { // Parenthèse ouvrante
                operators.push(token);
            } else if (token.equals(")")) { // Parenthèse fermante
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    output.add(operators.pop());
                }
                operators.pop(); // Retirer la parenthèse ouvrante
            }
        }

        while (!operators.isEmpty()) {
            output.add(operators.pop());
        }

        return output;
    }

    // 🛠️ Construction de l'arbre d'expression à partir de la notation postfixée
    private Expression buildExpressionFromPostfix(Queue<String> tokens) {
        Stack<Expression> stack = new Stack<>();

        while (!tokens.isEmpty()) {
            String token = tokens.poll();

            if (token.matches("-?\\d+")) { // Nombre
                stack.push(new NumberExpression(Integer.parseInt(token)));
            } else if (token.matches("[a-zA-Z]+")) { // Variable
                stack.push(new VariableExpression(token));
            } else if (token.equals("+") || token.equals("*")) { // Opérateurs
                if (stack.size() < 2) throw new IllegalArgumentException("Expression invalide");

                Expression right = stack.pop();
                Expression left = stack.pop();

                if (token.equals("+")) {
                    stack.push(new AdditionExpression(left, right));
                } else {
                    stack.push(new MultiplicationExpression(left, right));
                }
            }
        }

        if (stack.size() != 1) throw new IllegalArgumentException("Expression mal formée");

        return stack.pop();
    }
}