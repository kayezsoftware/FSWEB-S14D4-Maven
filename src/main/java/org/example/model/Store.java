package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = {
                new Bread("Test", 10, "Test Bread"),
                new Chocolate("Test", 10, "Test Chocolate"),
                new Coke("Test", 10, "Test Coke")
        };
        listProducts(products);
    }
}