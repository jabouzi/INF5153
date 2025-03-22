package org.example.semaine10.mvvm.example2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// Model: Handles authentication logic
class UserModel {
    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}

