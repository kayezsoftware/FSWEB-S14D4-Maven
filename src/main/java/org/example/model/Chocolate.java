package org.example.model;

public class Chocolate extends ProductForSale {
    private double cocoaPercentage;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaPercentage = 70.0;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate -> Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}
