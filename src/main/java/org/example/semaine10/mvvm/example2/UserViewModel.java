package org.example.semaine10.mvvm.example2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// ViewModel: Acts as a bridge between Model and View
class UserViewModel {
    private UserModel model;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private boolean isAuthenticated;

    public UserViewModel(UserModel model) {
        this.model = model;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void login(String username, String password) {
        boolean result = model.authenticate(username, password);
        support.firePropertyChange("isAuthenticated", this.isAuthenticated, result);
        this.isAuthenticated = result;
    }
}
