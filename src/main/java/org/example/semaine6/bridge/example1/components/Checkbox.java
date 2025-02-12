package org.example.semaine6.bridge.example1.components;

import org.example.semaine6.bridge.example1.platform.Platform;
public class Checkbox extends Component {
    public Checkbox(Platform platform) {
        super(platform);
    }

    public void check() {
        System.out.println("Checkbox was checked.");
        platform.updateUI();
    }

    public void uncheck() {
        System.out.println("Checkbox was unchecked.");
        platform.updateUI();
    }
}
