package org.example.semaine10.mvp.example2;

// Main: Runs the application
public class MVPDemo {
    public static void main(String[] args) {
        UserView view = new ConsoleUserView();
        UserModel model = new UserModel();
        UserPresenter presenter = new UserPresenter(view, model);

        presenter.handleLogin("user", "password"); // Simulating input
    }
}
