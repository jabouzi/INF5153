package org.example.semaine4.solid.srp.violation.ex2;

import org.example.semaine4.solid.srp.solution.ex2.PasswordHasher;
import org.example.semaine4.solid.srp.solution.ex2.UsersDao;

public class AuthManager {
    private String loggedInUser;

    public boolean login(String username, String password) {
        String hashedPassword = hashPassword(password);
        if (userExistsInDB(username, hashedPassword)) {
            loggedInUser = username;
            return true;
        }
        return false;
    }

    public void logout() {
        loggedInUser = null;
    }

    private String hashPassword(String password) {
        // code
        return "hashed password";
    }

    private Boolean userExistsInDB(String username, String hashedPassword) {
        // code
        return true;
    }
}

