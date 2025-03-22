package org.example.semaine10.mvp.example1;

public class UserPresenter {
    private User model;
    private UserView view;

    public UserPresenter(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayUserDetails(model.getName(), model.getAge());
    }
}
