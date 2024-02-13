package se.yrgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart cart = new ShoppingCart();
    private Product product1 = new Product("lax", "3", 140);
    private Product product2 = new Product("lampa", "4", 100);

    @Test
    public void addProductTest() {
        cart.addProductToCart(product1);
        assertEquals(1, cart.getShoppingCart().size());
        assertTrue(cart.getShoppingCart().contains(product1));
    }

    @Test
    public void removeProductTest() {
        cart.removeProductFromCart(product1);
        assertEquals(0, cart.getShoppingCart().size());
        assertFalse(cart.getShoppingCart().contains(product1));
    }
    @Test
    public void totalValueTest() {
        cart.addProductToCart(product1);
        cart.addProductToCart(product2);
        assertEquals(240, cart.valueOfCart());
        
    }

}