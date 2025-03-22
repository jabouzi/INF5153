package org.example.semaine10.mvc.example2;

// Controller: Handles user input and updates View/Model
class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void handleLogin(String username, String password) {
        if (model.authenticate(username, password)) {
            view.showLoginSuccess();
        } else {
            view.showLoginError();
        }
    }
}
