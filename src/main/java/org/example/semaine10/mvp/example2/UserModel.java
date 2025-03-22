package org.example.semaine10.mvp.example2;

// Model: Manages data
class UserModel {
    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}

