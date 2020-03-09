package com.kodilla.good.patterns.challenges;

public class Item {
    private String name;
    private Double price;
    private String description;

    public Item(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
