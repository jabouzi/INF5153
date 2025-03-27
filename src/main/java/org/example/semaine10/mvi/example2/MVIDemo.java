package org.example.semaine10.mvi.example2;

// Main: Runs the app
public class MVIDemo {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();

        UserMVIController controller = new UserMVIController(model, view::render);

        controller.processIntent(new LoginIntent("user", "password")); // Simulating input
        controller.processIntent(new LoginIntent("user2", "password2")); // Simulating input
    }
}
