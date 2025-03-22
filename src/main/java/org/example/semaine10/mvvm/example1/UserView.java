package org.example.semaine10.mvvm.example1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class UserView implements PropertyChangeListener {
    public UserView(UserViewModel viewModel) {
        viewModel.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        User user = (User) evt.getNewValue();
        System.out.println("User Details Updated:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }
}
