package org.example.labo_10avril2025.tdd;

// CurrencyConverterTest.java (version complète)
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;

public class CurrencyConverterTest {

    private CurrencyConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new CurrencyConverter("EUR");
    }

    @Test
    public void testAddCurrency() {
        converter.addCurrency("USD", 1.1);
        assertTrue(converter.hasCurrency("USD"));
    }

    @Test
    public void testAddCurrencyWithInvalidRate() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.addCurrency("JPY", -130.0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            converter.addCurrency("GBP", 0);
        });
    }

    @Test
    public void testGetExchangeRate() {
        converter.addCurrency("USD", 1.1);
        assertEquals(1.1, converter.getExchangeRate("USD"), 0.001);
        assertEquals(1.0, converter.getExchangeRate("EUR"), 0.001);
    }

    @Test
    public void testGetExchangeRateForNonExistingCurrency() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.getExchangeRate("JPY");
        });
    }

    @Test
    public void testConvert() {
        converter.addCurrency("USD", 1.1);
        converter.addCurrency("GBP", 0.85);

        // EUR to USD
        assertEquals(110.0, converter.convert(100.0, "EUR", "USD"), 0.001);

        // USD to EUR
        assertEquals(90.91, converter.convert(100.0, "USD", "EUR"), 0.01);

        // USD to GBP
        assertEquals(77.27, converter.convert(100.0, "USD", "GBP"), 0.01);
    }

    @Test
    public void testConvertWithInvalidCurrency() {
        converter.addCurrency("USD", 1.1);

        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(100.0, "JPY", "USD");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(100.0, "USD", "JPY");
        });
    }

    @Test
    public void testConvertWithNegativeAmount() {
        converter.addCurrency("USD", 1.1);

        assertThrows(IllegalArgumentException.class, () -> {
            converter.convert(-100.0, "EUR", "USD");
        });
    }

    @Test
    public void testUpdateExchangeRate() {
        converter.addCurrency("USD", 1.1);
        assertEquals(1.1, converter.getExchangeRate("USD"), 0.001);

        converter.updateExchangeRate("USD", 1.2);
        assertEquals(1.2, converter.getExchangeRate("USD"), 0.001);
    }

    @Test
    public void testUpdateExchangeRateForNonExistingCurrency() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.updateExchangeRate("JPY", 130.0);
        });
    }

    @Test
    public void testUpdateBaseCurrencyRate() {
        assertThrows(IllegalArgumentException.class, () -> {
            converter.updateExchangeRate("EUR", 1.2);
        });
    }

    @Test
    public void testGetAvailableCurrencies() {
        converter.addCurrency("USD", 1.1);
        converter.addCurrency("GBP", 0.85);
        converter.addCurrency("JPY", 130.0);

        Set<String> currencies = converter.getAvailableCurrencies();
        assertEquals(4, currencies.size()); // EUR (base) + 3 autres
        assertTrue(currencies.contains("EUR"));
        assertTrue(currencies.contains("USD"));
        assertTrue(currencies.contains("GBP"));
        assertTrue(currencies.contains("JPY"));
    }

    @Test
    public void testGetBaseCurrency() {
        assertEquals("EUR", converter.getBaseCurrency());
    }
}