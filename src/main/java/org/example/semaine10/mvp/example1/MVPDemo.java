package org.example.semaine10.mvp.example1;

public class MVPDemo {
    public static void main(String[] args) {
        User model = new User("Jane Doe", 30);
        UserView view = new ConsoleUserView();
        UserPresenter presenter = new UserPresenter(model, view);

        presenter.updateView();
    }
}