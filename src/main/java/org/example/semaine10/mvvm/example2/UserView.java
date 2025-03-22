package org.example.semaine10.mvvm.example2;

// View: Observes ViewModel changes
class UserView {
    public void updateView(boolean isAuthenticated) {
        if (isAuthenticated) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}
