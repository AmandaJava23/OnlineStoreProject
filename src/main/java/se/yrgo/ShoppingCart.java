package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> shoppingCart;
    
    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    /**
     * Adding a product to the shopping cart.
     * @param product The product that will be added to the shopping cart.
     */
    public void addProductToCart(Product product) {
        shoppingCart.add(product);
    }

    /**
     * Removes a product from the shopping cart.
     * @param product The product that will be removed from the shopping cart.
     */
    public void removeProductFromCart(Product product) {
        shoppingCart.remove(product);
    }

    /**
     * Calculates the total value of the items in the shopping cart.
     * @return The total value of the items in the shopping cart.
     * @throws NullPointerException If the shopping cart is empty (null).
     */
    public double valueOfCart() throws NullPointerException{
        if (shoppingCart == null ) {
            throw new NullPointerException("Shoppingcart is empty!");
        }

        double valueOfCart = 0;
        for (Product product : shoppingCart) {
            valueOfCart = valueOfCart + product.getPrice();
        }
        return valueOfCart;
    }


    /**
     * Prints the products name and price in the shopping cart.
     *
     */
    public void showShoppingCart() {
        for (Product product : shoppingCart) {
            System.out.println(product.getName() + ", Price: " + product.getPrice());
        }
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return String.format("Shopping Cart: %s%n" , shoppingCart);
    }
}