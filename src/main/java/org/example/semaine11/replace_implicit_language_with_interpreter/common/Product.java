package org.example.semaine11.replace_implicit_language_with_interpreter.common;

public class Product {

    private String name;
    private double Price;
    private Color color;

    public Product(String model, double price, Color color) {
        this.name = model;
        Price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
