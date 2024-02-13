package se.yrgo;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "David", "david.david@com");
        ShoppingCart cart = new ShoppingCart();
        //Product product = new Product();
      //  cart.addProductToCart(product);
        customer.placeOrder(cart);

        System.out.println(customer );
        System.out.println(cart);

    }
}