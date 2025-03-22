package org.example.semaine10.mvp.example2;

// Presenter: Handles logic and updates View
class UserPresenter {
    private UserView view;
    private UserModel model;

    public UserPresenter(UserView view, UserModel model) {
        this.view = view;
        this.model = model;
    }

    public void handleLogin(String username, String password) {
        if (model.authenticate(username, password)) {
            view.showLoginSuccess();
        } else {
            view.showLoginError();
        }
    }
}
