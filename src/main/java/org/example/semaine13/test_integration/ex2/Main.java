package org.example.semaine13.test_integration.ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Swing requiert que l'UI soit lancée sur l'EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(() -> {
            NameService service = new NameService();
            new NameForm(service); // Crée et affiche la fenêtre
        });
    }
}
