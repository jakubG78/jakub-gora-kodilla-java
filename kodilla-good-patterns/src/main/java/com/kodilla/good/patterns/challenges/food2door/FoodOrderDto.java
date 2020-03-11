package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderDto {
    private FoodSupplier foodSupplier;
    private FoodItem foodItem;
    private boolean isOrderCompleted;

    public FoodOrderDto(FoodSupplier foodSupplier, FoodItem foodItem, boolean isOrderCompleted) {
        this.foodSupplier = foodSupplier;
        this.foodItem = foodItem;
        this.isOrderCompleted = isOrderCompleted;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public boolean isOrderCompleted() {
        return isOrderCompleted;
    }
}
