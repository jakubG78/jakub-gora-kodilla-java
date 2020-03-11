package com.kodilla.good.patterns.challenges.food2door;

public class FoodItem {
    private String name;
    private Double quantity;
    private ItemUnits itemUnits;

    public FoodItem(String name, Double quantity, ItemUnits itemUnits) {
        this.name = name;
        this.quantity = quantity;
        this.itemUnits = itemUnits;
    }

    public String getName() {
        return name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public ItemUnits getItemUnits() {
        return itemUnits;
    }
}
