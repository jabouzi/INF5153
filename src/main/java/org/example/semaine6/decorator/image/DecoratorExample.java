package org.example.semaine6.decorator.image;

import org.example.semaine6.decorator.image.Image;
import org.example.semaine6.decorator.image.filter.BrightnessFilter;
import org.example.semaine6.decorator.image.filter.ContrastFilter;
import org.example.semaine6.decorator.image.filter.SaturationFilter;

public class DecoratorExample {
    public static void main(String[] args) {
        Image image = new FileImage("image.jpg");

        Image filteredImage1 = new SaturationFilter(
                new ContrastFilter(
                        new BrightnessFilter(image)
                )
        );

        Image filteredImage2 = new ContrastFilter(
                new BrightnessFilter(image)
        );

        filteredImage1.display();
        filteredImage2.display();

        /**** Utilisation alternative ****/
        Image image2 = new FileImage("photo.jpg");

        // Application de filtres dynamiquement
        Image brightImage = new BrightnessFilter(image2);
        Image contrastImage = new ContrastFilter(brightImage);
        Image finalImage = new SaturationFilter(contrastImage);
    }
}

/*
Applying saturation filter
Applying contrast filter
Applying brightness filter
Displaying image.jpg
Applying contrast filter
Applying brightness filter
Displaying image.jpg
 */
