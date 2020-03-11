package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShopOrderRequestRetriver {
    public FoodOrderRequest retrive(){
        FoodSupplier foodSupplier = new FoodSupplier("GlutenFreeShop");
        FoodItem foodItem = new FoodItem("Corn", 5.0, ItemUnits.QTY);
        return new FoodOrderRequest(foodSupplier, foodItem);
    }
}
