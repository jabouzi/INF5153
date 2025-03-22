package org.example.semaine10.mvvm.example1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class UserViewModel {
    private User model;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public UserViewModel(User model) {
        this.model = model;
    }

    public String getName() {
        return model.getName();
    }

    public int getAge() {
        return model.getAge();
    }

    // Method to notify the View of changes
    public void updateUser(String name, int age) {
        model = new User(name, age);
        support.firePropertyChange("user", null, model);
    }

    // Add a listener for property changes
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}