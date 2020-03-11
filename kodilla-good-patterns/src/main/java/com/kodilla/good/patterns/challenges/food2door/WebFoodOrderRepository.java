package com.kodilla.good.patterns.challenges.food2door;

public class WebFoodOrderRepository implements FoodOrderRepository{
    @Override
    public boolean createOrder(FoodSupplier foodSupplier, FoodItem foodItem) {
        System.out.println("Adding to repository web order form: " + foodSupplier.getName() + ".");
        System.out.println("Order is contain: " + foodItem.getQuantity() + foodItem.getItemUnits() + " of " + foodItem.getName()+"\n");
        return true;
    }
}
