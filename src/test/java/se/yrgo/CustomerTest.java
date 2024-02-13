package se.yrgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomerTest {
    /**
     * Test to see if order history works
     * if you have 0 items in your history the first assertEquals will be true
     * if you have added items the second assertEquals will be true.
     */
    @Test
    public void orderHistoryTest() {
        Customer customer = new Customer(1,
                "David", "david@david.com");
        assertEquals(0, customer.orderHistory.size());
        ShoppingCart cart = new ShoppingCart();
        customer.placeOrder(cart);
        assertEquals(1, customer.orderHistory.size());
    }

    @Test
    public void placeOrderTest() {
        Customer customer = new Customer(1,
                "David", "david@david.com");
        ShoppingCart cart = new ShoppingCart();
        customer.placeOrder(cart);
        assertEquals(1, customer.orderHistory.size());
        assertThrows(IllegalArgumentException.class, () -> customer.placeOrder(null));
    }
}
