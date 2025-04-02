package org.example.semaine11.replace_implicit_language_with_interpreter.apres;

import org.example.semaine11.replace_implicit_language_with_interpreter.common.Color;
import org.example.semaine11.replace_implicit_language_with_interpreter.common.Product;

import java.util.Arrays;
import java.util.List;

// Exemple d'utilisation
public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("iPhone", 999.99, Color.RED),
                new Product("Pixel", 799.99, Color.BLUE),
                new Product("Galaxy", 899.99, Color.RED)
        );

        ProductFinder finder = new ProductFinder(products);

        // Critère: prix < 900 ET couleur = rouge
        Specification<Product> cheapAndRed = new AndSpec<>(
                new PriceSpec(900),
                new ColorSpec(Color.RED)
        );

        List<Product> results = finder.selectBy(cheapAndRed);
        results.forEach(p -> System.out.println(p.getName()));
        // Affiche: "Galaxy" (seul produit rouge < 900)
    }
}
