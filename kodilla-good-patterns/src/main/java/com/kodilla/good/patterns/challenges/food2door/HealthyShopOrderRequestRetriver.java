package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShopOrderRequestRetriver {
    public FoodOrderRequest retrive(){
        FoodSupplier foodSupplier = new FoodSupplier("HealthyShop");
        FoodItem foodItem = new FoodItem("Eggs", 10.0, ItemUnits.QTY);
        return new FoodOrderRequest(foodSupplier, foodItem);
    }
}
