package se.yrgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void productNameTest() {
        Product axe = new Product("axe", "SA234325", 140.00);
        assertEquals("axe", axe.getName());
    }

    Product product2 = new Product("product2", "SA234325", 140.00);

    @Test
    public void productArtNoTest() {
        Product axe = new Product("axe", "SA234325", 140.00);
        assertEquals("SA234325", axe.getArtNo());
    }
    @Test
    public void productPriceTest() {
        Product axe = new Product("axe", "SA234325", 140.00);
        assertEquals(140.00, axe.getPrice());
    }
    @Test
    public void constructorShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
           new Product(null , "T12312", 140);
        }, "Name cannot be null"); // Detta är ett meddelande som visas om testet misslyckas
    }
    @Test
    public void constructorShouldThrowIllegalArgumentExceptionForNegativePrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("TestProduct", "TP123", -100.00);
        }, "Price cannot be negative"); // Detta är ett meddelande som visas om testet misslyckas
    }
}
