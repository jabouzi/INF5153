package org.example.semaine13.test_integration.ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NameForm extends JFrame {
    public JTextField nameField;
    public JButton submitButton;
    private final NameService nameService;

    public NameForm(NameService nameService) {
        this.nameService = nameService;
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Test d'Intégration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ferme l'app quand la fenêtre se ferme

        nameField = new JTextField(20);
        submitButton = new JButton("Valider");

        submitButton.addActionListener(e -> {
            String result = nameService.processName(nameField.getText());
            JOptionPane.showMessageDialog(this, "Résultat : " + result);
        });

        setLayout(new java.awt.FlowLayout());
        add(nameField);
        add(submitButton);

        pack(); // Ajuste la taille automatiquement
        setLocationRelativeTo(null); // Centre la fenêtre
        setVisible(true); // Rend visible
    }
}