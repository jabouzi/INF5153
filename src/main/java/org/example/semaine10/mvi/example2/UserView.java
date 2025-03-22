package org.example.semaine10.mvi.example2;

// View: Handles UI
class UserView {
    public void render(boolean isAuthenticated) {
        if (isAuthenticated) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed!");
        }
    }
}
