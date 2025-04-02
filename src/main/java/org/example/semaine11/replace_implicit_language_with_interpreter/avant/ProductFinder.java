package org.example.semaine11.replace_implicit_language_with_interpreter.avant;

import org.example.semaine11.replace_implicit_language_with_interpreter.common.Color;
import org.example.semaine11.replace_implicit_language_with_interpreter.common.Product;
import java.util.*;
import java.util.List;

class ProductFinder {
    private List<Product> products;

    public ProductFinder(List<Product> products) {
        this.products = products;
    }

    // Méthode avec critère de prix implicite
    public List<Product> getProductsBelowPrice(double maxPrice) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getPrice() < maxPrice) results.add(p);
        }
        return results;
    }

    // Méthode avec critère de couleur implicite
    public List<Product> getProductsByColor(Color color) {
        List<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getColor().equals(color)) results.add(p);
        }
        return results;
    }

    // Problème : Et si on veut "prix < 100 ET couleur = rouge" ?
    // => On doit écrire une nouvelle méthode dupliquant la logique!
}

