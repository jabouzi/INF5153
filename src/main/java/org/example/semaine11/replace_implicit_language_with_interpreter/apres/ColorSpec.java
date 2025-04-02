package org.example.semaine11.replace_implicit_language_with_interpreter.apres;

import org.example.semaine11.replace_implicit_language_with_interpreter.common.Color;
import org.example.semaine11.replace_implicit_language_with_interpreter.common.Product;

class ColorSpec implements Specification<Product> {
    private Color color;

    public ColorSpec(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfiedBy(Product p) {
        return p.getColor().equals(color);
    }
}
