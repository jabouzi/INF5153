package org.example.semaine10.mvc.example2;

// Model: Handles data and business logic
class UserModel {
    private String username;

    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}

