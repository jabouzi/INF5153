package org.example.semaine7.interpreter.example1;

// Client: Simule l'utilisation de l'interpréteur
public class InterpreterExample {
    public static void main(String[] args) {
        // Créer le contexte avec des variables
        Context context = new Context();
        context.setVariable("x", 3);  // x = 3

        // Créer et utiliser l'interpréteur
        Interpreter interpreter = new Interpreter(context);
        int result = interpreter.interpret("2 + x * 4");

        System.out.println("Résultat : " + result);  // Résultat : 14
    }
}
