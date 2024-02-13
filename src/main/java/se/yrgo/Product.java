package se.yrgo;

public class Product {
    private String name;
    private String artNo;
    private double price;

    public Product(String name, String artNo, double price) {
        this.name = name;
        this.artNo = artNo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getArtNo() {
        return artNo;
    }

    public double getPrice() {
        return price;
    }
}
