package org.example.semaine4.solid.srp.solution.ex2;

public class AuthManager {
    private final PasswordHasher passwordHasher;
    private final UsersDao usersDao;
    private String loggedInUser;

    public AuthManager(PasswordHasher passwordHasher, UsersDao usersDao) {
        this.passwordHasher = passwordHasher;
        this.usersDao = usersDao;
    }

    public boolean login(String username, String password) {
        String hashedPassword = passwordHasher.hashPassword(password);
        if (usersDao.userExists(username, hashedPassword)) {
            loggedInUser = username;
            return true;
        }
        return false;
    }

    public void logout() {
        loggedInUser = null;
    }

    public String getLoggedInUsername() {
        return loggedInUser;
    }
}
