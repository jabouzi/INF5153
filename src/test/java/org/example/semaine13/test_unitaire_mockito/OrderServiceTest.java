package org.example.semaine13.test_unitaire_mockito;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Mock
    private PaymentGateway paymentGateway;

    private OrderService orderService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        orderService = new OrderService(paymentGateway);
    }

    @Test
    void testPlaceOrderSuccessful() throws InterruptedException {
        // Arrangement
        Order order = new Order();
        order.setAmount(100.0);
        order.setCreditCardNumber("4111111111111111");

        // Mock behavior
        when(paymentGateway.processPayment(100.0, "4111111111111111")).thenReturn(true);

        // Action
        boolean result = orderService.placeOrder(order);

        // Assertion
        assertTrue(result, "L'ordre devrait être placé avec succès");
        verify(paymentGateway).processPayment(100.0, "4111111111111111");
    }

    @Test
    void testPlaceOrderPaymentFailed() throws InterruptedException {
        // Arrangement
        Order order = new Order();
        order.setAmount(100.0);
        order.setCreditCardNumber("4111111111111111");

        // Mock behavior
        when(paymentGateway.processPayment(anyDouble(), anyString())).thenReturn(false);

        // Action
        boolean result = orderService.placeOrder(order);

        // Assertion
        assertFalse(result, "L'ordre ne devrait pas être placé si le paiement échoue");
        verify(paymentGateway).processPayment(100.0, "4111111111111111");
    }

    @Test
    void testPlaceOrderInvalidAmount() throws InterruptedException {
        // Arrangement
        Order order = new Order();
        order.setAmount(-50.0); // Montant invalide

        // Action
        boolean result = orderService.placeOrder(order);

        // Assertion
        assertFalse(result, "L'ordre ne devrait pas être placé avec un montant négatif");
        // Vérifie que processPayment n'a pas été appelé
        verifyNoInteractions(paymentGateway);
    }
}