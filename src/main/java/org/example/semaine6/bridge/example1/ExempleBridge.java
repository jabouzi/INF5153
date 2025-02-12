package org.example.semaine6.bridge.example1;

import org.example.semaine6.bridge.example1.components.Button;
import org.example.semaine6.bridge.example1.components.Checkbox;
import org.example.semaine6.bridge.example1.platform.LinuxPlatform;
import org.example.semaine6.bridge.example1.platform.MacPlatform;
import org.example.semaine6.bridge.example1.platform.Platform;
import org.example.semaine6.bridge.example1.platform.WindowsPlatform;

public class ExempleBridge {
    public static void main(String[] args) {
        Platform linuxPlatform = new LinuxPlatform();
        Platform windowsPlatform = new WindowsPlatform();
        Platform macPlatform = new MacPlatform();

        Button buttonOnLinux = new Button(linuxPlatform);
        Button buttonOnWindows = new Button(windowsPlatform);

        buttonOnLinux.click();
        buttonOnWindows.click();

        Checkbox checkboxOnLinux = new Checkbox(linuxPlatform);
        Checkbox checkboxOnMac = new Checkbox(macPlatform);

        checkboxOnLinux.check();
        checkboxOnLinux.uncheck();
        checkboxOnMac.check();
    }
}

/*
Button was clicked.
Updating UI on Linux Platform.
Button was clicked.
Updating UI on Windows Platform.
Checkbox was checked.
Updating UI on Linux Platform.
Checkbox was unchecked.
Updating UI on Linux Platform.
Checkbox was checked.
Updating UI on Mac Platform.
 */