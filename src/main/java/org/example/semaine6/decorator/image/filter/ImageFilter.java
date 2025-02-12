package org.example.semaine6.decorator.image.filter;

import org.example.semaine6.decorator.image.Image;
abstract class ImageFilter implements Image {
    protected Image image;

    public ImageFilter(Image image) {
        this.image = image;
    }

    @Override
    public void display() {
        image.display();
    }
}
