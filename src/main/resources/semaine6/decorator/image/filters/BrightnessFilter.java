package com.dominikcebula.edu.design.patterns.structural.decorator.image.filters;

import org.example.semaine6.decorator.image.Image;

public class BrightnessFilter extends ImageFilter {
    public BrightnessFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        System.out.println("Applying brightness filter");
        super.display();
    }
}
