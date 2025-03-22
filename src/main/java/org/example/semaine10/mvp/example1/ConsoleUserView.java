package org.example.semaine10.mvp.example1;

public class ConsoleUserView implements UserView {
    @Override
    public void displayUserDetails(String name, int age) {
        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
