package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new WebFoodOrderRepository());
        orderProcessor.process(new FoodSupplier("ExtraFoodShop"));
        orderProcessor.process(new FoodSupplier("HealthyShop"));
        orderProcessor.process(new FoodSupplier("GlutenFreeShop"));
    }
}
