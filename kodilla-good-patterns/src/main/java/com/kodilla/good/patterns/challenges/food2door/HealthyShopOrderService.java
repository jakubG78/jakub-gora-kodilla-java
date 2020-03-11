package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopOrderService implements FoodOrderService {
    public boolean order(FoodSupplier foodSupplier, FoodItem foodItem) {
        System.out.println("Processing order form " + foodSupplier.getName());
        System.out.println("Checking with WHO if current order items are healthy... OK!");
        System.out.println("Ordering: " + foodItem.getQuantity() + foodItem.getItemUnits() + " of " + foodItem.getName()+"\n");
        return true;
    }
}
