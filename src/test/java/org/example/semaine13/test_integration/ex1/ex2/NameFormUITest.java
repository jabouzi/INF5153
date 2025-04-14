package org.example.semaine13.test_integration.ex1.ex2;

import org.assertj.swing.core.Robot;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.example.semaine13.test_integration.ex2.NameForm;
import org.example.semaine13.test_integration.ex2.NameService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.junit.testcase.AssertJSwingJUnitTestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class NameFormUITest {
    private FrameFixture window;

    @BeforeEach
    public void setUp() {
        // Exécute dans l'EDT
        NameForm frame = GuiActionRunner.execute(() -> new NameForm(new NameService()));
        window = new FrameFixture(frame);
        window.show();
        Robot robot = window.robot();
        robot.waitForIdle(); // <-- Attente synchrone
    }

    @Test
    public void testUIInteraction() {
        window.textBox("nameField").requireVisible();
        window.textBox("nameField").enterText("Alice");
        window.button("submitButton").click();
        window.optionPane().requireMessage("Résultat : ALICE");
    }

    @AfterEach
    public void tearDown() {
        if (window != null) window.cleanUp(); // Ferme la fenêtre
    }
}