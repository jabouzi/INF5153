package org.example.semaine10.mvi.example2;

// Intent: Represents user action
class LoginIntent {
    String username;
    String password;

    public LoginIntent(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
