package org.example.semaine10.mvvm.example1;

public class MVVMDemo {
    public static void main(String[] args) {
        User model = new User("Alice", 28);
        UserViewModel viewModel = new UserViewModel(model);
        UserView view = new UserView(viewModel);

        // Simulate a change in the model
        System.out.println("Updating user details...");
        viewModel.updateUser("Alice Smith", 29); // This will trigger the View to update
    }
}
