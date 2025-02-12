package com.dominikcebula.edu.design.patterns.structural.bridge.ui.components;

import org.example.semaine6.bridge.example1.platform.Platform;
public class Button extends Component {
    public Button(Platform platform) {
        super(platform);
    }

    public void click() {
        System.out.println("Button was clicked.");
        platform.updateUI();
    }
}
