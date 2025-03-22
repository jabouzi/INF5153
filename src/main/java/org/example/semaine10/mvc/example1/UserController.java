package org.example.semaine10.mvc.example1;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.displayUserDetails(model.getName(), model.getAge());
    }
}
