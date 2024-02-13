package edu.step.oop;

public class Product {   private final int productId;
    private String name;
    private double price;
    private int quantity;


    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public Product(int productId) {
        this.productId = productId;
    }


    public double getPrice() {
        return price;
    }


    public void updateQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Cantitatea nu poate fi negativă!");
        }
    }
}
