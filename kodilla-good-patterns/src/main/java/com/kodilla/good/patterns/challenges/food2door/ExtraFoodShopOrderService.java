package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopOrderService implements FoodOrderService {
    public boolean order(FoodSupplier foodSupplier, FoodItem foodItem) {
        System.out.println("Processing order form " + foodSupplier.getName());
        System.out.println("Ordering: " + foodItem.getQuantity() + foodItem.getItemUnits() + " of " + foodItem.getName() + "\n");
        if (foodItem.equals(null)) return false;
        else return true;
    }
}
