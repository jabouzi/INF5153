package org.example.semaine10.mvc.example1;

public class MVCDemo {
    public static void main(String[] args) {
        User model = new User("John Doe", 25);
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.updateView();
    }
}
