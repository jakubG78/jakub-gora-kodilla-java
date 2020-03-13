package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor(new WebFoodOrderRepository());
        orderProcessor.process("ExtraFoodShop");
        orderProcessor.process("HealthyShop");
        orderProcessor.process("GlutenFreeShop");
    }
}
