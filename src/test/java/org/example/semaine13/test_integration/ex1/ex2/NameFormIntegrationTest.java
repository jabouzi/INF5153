package org.example.semaine13.test_integration.ex1.ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.example.semaine13.test_integration.ex2.NameForm;
import org.example.semaine13.test_integration.ex2.NameService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NameFormIntegrationTest {
    @Test
    public void testFormAndServiceIntegration() {
        // 1. Créer un mock du service
        NameService mockService = mock(NameService.class);
        when(mockService.processName("Alice")).thenReturn("ALICE");

        // 2. Simuler l'action de l'utilisateur
        NameForm form = new NameForm(mockService);
        form.nameField.setText("Alice");
        form.submitButton.doClick(); // Déclenche le traitement

        // 3. Vérifier que le service a bien été appelé
        verify(mockService).processName("Alice");
    }

    @Test
    public void testFormAndServiceIntegrationNoUI() {
        NameService mockService = mock(NameService.class);
        NameForm form = new NameForm(mockService); // Pas de fenêtre réelle affichée
        form.nameField.setText("Alice");
        form.submitButton.doClick(); // Simulation de clic
        verify(mockService).processName("Alice"); // Vérification
    }
}