package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderRequest {

    private FoodSupplier foodSupplier;
    private FoodItem foodItem;

    public FoodOrderRequest(FoodSupplier foodSupplier, FoodItem foodItem) {
        this.foodSupplier = foodSupplier;
        this.foodItem = foodItem;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }
}
