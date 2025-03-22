package org.example.semaine10.mvp.example2;

// Console-based View Implementation
class ConsoleUserView implements UserView {
    @Override
    public void showLoginSuccess() {
        System.out.println("Login Successful!");
    }

    @Override
    public void showLoginError() {
        System.out.println("Login Failed!");
    }
}
