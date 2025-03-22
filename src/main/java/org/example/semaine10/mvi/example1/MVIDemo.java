package org.example.semaine10.mvi.example1;

public class MVIDemo {
    public static void main(String[] args) {
        User model = new User("Bob", 35);
        UserView view = new UserView();
        UserIntent intent = new UserIntent(UserIntent.FETCH_USER);

        // Process intent
        if (intent.getAction().equals(UserIntent.FETCH_USER)) {
            view.render(model);
        }
    }
}