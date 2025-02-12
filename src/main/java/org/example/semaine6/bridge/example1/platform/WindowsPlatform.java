package org.example.semaine6.bridge.example1.platform;

public class WindowsPlatform implements Platform {
    @Override
    public void updateUI() {
        System.out.println("Updating UI on Windows Platform.");
    }
}
