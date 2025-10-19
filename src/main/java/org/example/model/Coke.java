package org.example.model;

public class Coke extends ProductForSale {
    private boolean isDiet;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.isDiet = false;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke -> Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }
}
