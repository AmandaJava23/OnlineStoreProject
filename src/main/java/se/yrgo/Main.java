package se.yrgo;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "David", "david@david.com");
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("Slickepott","120B",40000);
        Product product2 = new Product("Trocadero","69K",719.99);
        cart.addProductToCart(product);
        cart.addProductToCart(product2);
        customer.placeOrder(cart);
        System.out.println(customer);
        System.out.println("Shopping Cart:");
        cart.showShoppingCart();
        System.out.println();
        System.out.println(customer.orderHistory().replace("[","").replace("]",""));
        System.out.println("Total cost: " +cart.valueOfCart());


    }
}