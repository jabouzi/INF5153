package org.example.semaine11.replace_implicit_language_with_interpreter.apres;

import org.example.semaine11.replace_implicit_language_with_interpreter.common.Product;

import java.util.List;
import java.util.stream.Collectors;

// Étape 4: ProductFinder refactorisé
class ProductFinder {
    private List<Product> products;

    public ProductFinder(List<Product> products) {
        this.products = products;
    }

    public List<Product> selectBy(Specification<Product> spec) {
        return products.stream()
                .filter(spec::isSatisfiedBy)
                .collect(Collectors.toList());
    }
}
