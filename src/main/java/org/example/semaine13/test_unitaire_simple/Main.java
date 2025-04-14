package org.example.semaine13.test_unitaire_simple;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("5 + 5 = 10.0 " + calculator.add(5, 5));
        System.out.println("5 x 5 = 25.0 " + calculator.multiply(5, 5));
        System.out.println("5 / 5 = 1.0 " + calculator.divide(5, 5));
        System.out.println("5 - 5 = 0.0 " + calculator.subtract(5, 5));
    }
}
