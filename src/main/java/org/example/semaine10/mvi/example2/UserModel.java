package org.example.semaine10.mvi.example2;

import java.util.function.Consumer;

// Model: Represents application state
class UserModel {
    private boolean isAuthenticated = false;

    public boolean authenticate(String username, String password) {
        isAuthenticated = "user".equals(username) && "password".equals(password);
        return isAuthenticated;
    }
}

