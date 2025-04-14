package org.example.semaine13.tdd;

public class LoginValidator {
    public boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) return false;
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(emailRegex);
    }

    public boolean validatePassword(String password) {
        if (password == null || password.isEmpty() || password.length() < 8) return false;

        // Vérifie toutes les conditions en une seule expression régulière
        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";
        return password.matches(passwordRegex);
    }

    public boolean validateLogin(String email, String password) {
        return validateEmail(email) && validatePassword(password);
    }
}
