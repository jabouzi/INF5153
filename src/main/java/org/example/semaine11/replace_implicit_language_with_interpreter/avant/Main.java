package org.example.semaine11.replace_implicit_language_with_interpreter.avant;

import org.example.semaine11.replace_implicit_language_with_interpreter.common.Color;
import org.example.semaine11.replace_implicit_language_with_interpreter.common.Product;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Création des produits
        List<Product> products = Arrays.asList(
                new Product("iPhone", 999.99, Color.RED),
                new Product("Pixel", 799.99, Color.BLUE),
                new Product("Galaxy", 899.99, Color.RED)
        );

        ProductFinder finder = new ProductFinder(products);

        // Filtrage par prix (< 900)
        System.out.println("Produits < 900$:");
        List<Product> cheapProducts = finder.getProductsBelowPrice(900);
        cheapProducts.forEach(p -> System.out.println("- " + p.getName()));

        // Filtrage par couleur (RED)
        System.out.println("\nProduits rouges:");
        List<Product> redProducts = finder.getProductsByColor(Color.RED);
        redProducts.forEach(p -> System.out.println("- " + p.getName()));
    }
}

