package org.example.semaine6.bridge.example1.platform;

public class LinuxPlatform implements Platform {
    @Override
    public void updateUI() {
        System.out.println("Updating UI on Linux Platform.");
    }
}
