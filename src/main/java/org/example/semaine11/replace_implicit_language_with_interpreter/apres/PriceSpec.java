package org.example.semaine11.replace_implicit_language_with_interpreter.apres;

import org.example.semaine11.replace_implicit_language_with_interpreter.common.Product;

// Étape 2: Critères concrets (expressions terminales)
class PriceSpec implements Specification<Product> {
    private double maxPrice;

    public PriceSpec(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatisfiedBy(Product p) {
        return p.getPrice() < maxPrice;
    }
}
