package org.example.semaine6.flyweight.text;

import org.example.semaine6.flyweight.text.component.TextLabel;

public class FlyweightExample {
    public static void main(String[] args) {
        TextLabel textLabel1 = new TextLabel("Arial", "Hello One!");
        TextLabel textLabel2 = new TextLabel("Arial", "Hello Two!");
        TextLabel textLabel3 = new TextLabel("Arial", "Hello Three!");

        TextLabel textLabel4 = new TextLabel("Times New Roman", "Hello Four!");
        TextLabel textLabel5 = new TextLabel("Times New Roman", "Hello Five!");

        textLabel1.render();
        textLabel2.render();
        textLabel3.render();
        textLabel4.render();
        textLabel5.render();
    }
}

/*
Creating Arial Font
Creating Times New Roman Font
Rendering using Arial Font: Hello One!
Rendering using Arial Font: Hello Two!
Rendering using Arial Font: Hello Three!
Rendering using Times New Roman Font: Hello Four!
Rendering using Times New Roman Font: Hello Five!
 */