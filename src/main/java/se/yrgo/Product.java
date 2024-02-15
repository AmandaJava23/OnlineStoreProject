package se.yrgo;
/*
Class for the creation of products used in the ShoppingCart and bought by the Customer
 */
public class Product {
    private String name;
    private String artNo;
    private double price;

    /*
    Constructor for the building of a product.
    @param name
    @param artNo
    @param price
    <p>
    @throws IllegalArgumentException
    <p>
     */
    public Product(String name, String artNo, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        if (artNo == null || artNo.trim().isEmpty()) {
            throw new IllegalArgumentException("Article number cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.name = name;
        this.artNo = artNo;
        this.price = price;
    }

/*
Getters for the the other classes to use the attributes of a product created by this class.
 */
    public String getName() {
        return name;
    }

    public String getArtNo() {
        return artNo;
    }

    public double getPrice() {
        return price;
    }

    /*
    toString-method for the ability to print out information about the created object
    @returns String
     */
    @Override
    public String toString() {
        return String.format("Product: %s%nProduct ID: %s%nPrice: %.2f%n", name, artNo, price);
    }
}
