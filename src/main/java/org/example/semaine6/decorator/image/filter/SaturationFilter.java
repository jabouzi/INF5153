package org.example.semaine6.decorator.image.filter;

import org.example.semaine6.decorator.image.Image;

public class SaturationFilter extends ImageFilter {
    public SaturationFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        System.out.println("Applying saturation filter");
        super.display();
    }
}