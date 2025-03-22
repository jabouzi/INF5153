package org.example.semaine10.mvi.example1;

public class UserView {
    public void render(User user) {
        System.out.println("User Details:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
    }
}
