package org.example.semaine13.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginValidatorTest {
    private LoginValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new LoginValidator();
    }

    @Test
    public void testEmptyEmailReturnsFalse() {
        boolean result = validator.validateEmail("");
        assertFalse(result);
    }

    @Test
    public void testValidEmailReturnsTrue() {
        boolean result = validator.validateEmail("user@example.com");
        assertTrue(result);
    }

    @Test
    public void testInvalidEmailReturnsFalse() {
        assertFalse(validator.validateEmail("userexample.com")); // Pas de @
        assertFalse(validator.validateEmail("user@example")); // Pas de domaine complet
    }

    @Test
    public void testEmptyPasswordReturnsFalse() {
        boolean result = validator.validatePassword("");
        assertFalse(result);
    }

    @Test
    public void testShortPasswordReturnsFalse() {
        assertFalse(validator.validatePassword("Abc123!"));
    }

    @Test
    public void testPasswordWithSufficientLengthReturnsTrue() {
        assertTrue(validator.validatePassword("Abcdef123!"));
    }

    @Test
    public void testPasswordWithoutUppercaseReturnsFalse() {
        assertFalse(validator.validatePassword("abcdef123!"));
    }

    @Test
    public void testPasswordWithoutDigitReturnsFalse() {
        assertFalse(validator.validatePassword("Abcdefgh!"));
    }

    @Test
    public void testPasswordWithoutSpecialCharReturnsFalse() {
        assertFalse(validator.validatePassword("Abcdef123"));
    }

    @Test
    public void testValidPasswordReturnsTrue() {
        assertTrue(validator.validatePassword("Abcdef123!"));
    }

    @Test
    public void testValidateLoginWithValidCredentials() {
        assertTrue(validator.validateLogin("user@example.com", "Password123!"));
    }

    @Test
    public void testValidateLoginWithInvalidEmail() {
        assertFalse(validator.validateLogin("invalid", "Password123!"));
    }

    @Test
    public void testValidateLoginWithInvalidPassword() {
        assertFalse(validator.validateLogin("user@example.com", "weak"));
    }

}
