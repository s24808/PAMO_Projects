package com.example.bmicalculator;

public class ShoppingItem {
    private final String name;
    private boolean purchased;

    public ShoppingItem(String name) {
        this.name = name;
        this.purchased = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }
}