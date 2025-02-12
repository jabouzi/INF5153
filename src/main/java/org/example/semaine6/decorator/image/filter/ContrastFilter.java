package org.example.semaine6.decorator.image.filter;

import org.example.semaine6.decorator.image.Image;

public class ContrastFilter extends ImageFilter {
    public ContrastFilter(Image image) {
        super(image);
    }

    @Override
    public void display() {
        System.out.println("Applying contrast filter");
        super.display();
    }
}
