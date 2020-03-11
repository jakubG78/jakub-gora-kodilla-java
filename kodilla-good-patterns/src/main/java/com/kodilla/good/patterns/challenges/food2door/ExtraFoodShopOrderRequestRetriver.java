package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShopOrderRequestRetriver {
    public FoodOrderRequest retrive(){
        FoodSupplier foodSupplier = new FoodSupplier("ExtraFoodShop");
        FoodItem foodItem = new FoodItem("Potatoes", 5.6, ItemUnits.KG);
        return new FoodOrderRequest(foodSupplier, foodItem);
    }
}
