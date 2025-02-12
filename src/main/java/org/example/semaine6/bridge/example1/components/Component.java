package org.example.semaine6.bridge.example1.components;

import org.example.semaine6.bridge.example1.platform.Platform;

abstract class Component {
    final Platform platform;

    Component(Platform platform) {
        this.platform = platform;
    }
}
