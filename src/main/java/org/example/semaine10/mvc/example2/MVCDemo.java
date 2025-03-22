package org.example.semaine10.mvc.example2;

// Main: Simulates user input
public class MVCDemo {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        controller.handleLogin("user", "password"); // Simulating input
    }
}
