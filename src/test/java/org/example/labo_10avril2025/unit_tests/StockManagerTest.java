package org.example.labo_10avril2025.unit_tests;

// StockManagerTest.java
import static org.junit.jupiter.api.Assertions.*;

import org.example.labo_10avril2025.unit_test.StockManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class StockManagerTest {

    private StockManager stockManager;

    @BeforeEach
    public void setUp() {
        stockManager = new StockManager();
        // Ajouter quelques produits pour les tests
        stockManager.addProduct("PROD1", 10);
        stockManager.addProduct("PROD2", 5);
    }

    @AfterEach
    public void tearDown() {
        stockManager = null;
    }

    @Test
    public void testAddProduct() {
        // Test d'ajout d'un nouveau produit
        stockManager.addProduct("PROD3", 15);
        assertEquals(15, stockManager.getProductQuantity("PROD3"));

        // Test d'ajout à un produit existant
        stockManager.addProduct("PROD1", 5);
        assertEquals(15, stockManager.getProductQuantity("PROD1"));
    }

    @Test
    public void testAddProductWithZeroQuantity() {
        stockManager.addProduct("PROD4", 0);
        assertEquals(0, stockManager.getProductQuantity("PROD4"));
    }

    @Test
    public void testAddProductWithInvalidParameters() {
        // Test avec ID null
        assertThrows(IllegalArgumentException.class, () -> {
            stockManager.addProduct(null, 5);
        });

        // Test avec ID vide
        assertThrows(IllegalArgumentException.class, () -> {
            stockManager.addProduct("", 5);
        });

        // Test avec quantité négative
        assertThrows(IllegalArgumentException.class, () -> {
            stockManager.addProduct("PROD5", -1);
        });
    }

    @Test
    public void testRemoveProduct() {
        // Test de retrait partiel
        stockManager.removeProduct("PROD1", 3);
        assertEquals(7, stockManager.getProductQuantity("PROD1"));

        // Test de retrait complet
        stockManager.removeProduct("PROD2", 5);
        assertEquals(0, stockManager.getProductQuantity("PROD2"));
    }

    @Test
    public void testRemoveProductWithInvalidParameters() {
        // Test avec produit inexistant
        assertThrows(IllegalArgumentException.class, () -> {
            stockManager.removeProduct("NONEXISTENT", 1);
        });

        // Test avec quantité excessive
        assertThrows(IllegalStateException.class, () -> {
            stockManager.removeProduct("PROD1", 20);
        });

        // Test avec quantité négative
        assertThrows(IllegalArgumentException.class, () -> {
            stockManager.removeProduct("PROD1", -1);
        });
    }

    @Test
    public void testGetProductQuantity() {
        assertEquals(10, stockManager.getProductQuantity("PROD1"));
        assertEquals(5, stockManager.getProductQuantity("PROD2"));
        assertEquals(0, stockManager.getProductQuantity("NONEXISTENT"));
    }

    @Test
    public void testIsProductAvailable() {
        assertTrue(stockManager.isProductAvailable("PROD1", 5));
        assertTrue(stockManager.isProductAvailable("PROD1", 10));
        assertFalse(stockManager.isProductAvailable("PROD1", 11));
        assertFalse(stockManager.isProductAvailable("NONEXISTENT", 1));
    }

    @Test
    public void testGetTotalProductTypes() {
        assertEquals(2, stockManager.getTotalProductTypes());

        stockManager.addProduct("PROD3", 7);
        assertEquals(3, stockManager.getTotalProductTypes());

        stockManager.removeProduct("PROD1", 10);
        assertEquals(2, stockManager.getTotalProductTypes());
    }
}
