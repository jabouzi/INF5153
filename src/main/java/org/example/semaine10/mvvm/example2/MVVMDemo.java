package org.example.semaine10.mvvm.example2;

// Main: Runs the app
public class MVVMDemo {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserViewModel viewModel = new UserViewModel(model);
        UserView view = new UserView();

        viewModel.addPropertyChangeListener(evt -> view.updateView((Boolean) evt.getNewValue()));

        viewModel.login("user", "password"); // Simulating input
    }
}
