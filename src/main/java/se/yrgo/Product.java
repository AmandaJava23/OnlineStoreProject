package se.yrgo;

public class Product {
    private String name;
    private String artNo;
    private double price;

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

    // Getter-metoder och toString() oförändrade
    public String getName() {
        return name;
    }

    public String getArtNo() {
        return artNo;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s%nProduct ID: %s%nPrice: %.2f%n", name, artNo, price);
    }
}
