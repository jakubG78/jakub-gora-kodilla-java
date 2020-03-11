package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main(String[] args) {

        ExtraFoodShopOrderRequestRetriver extraFoodShopOrderRequestRetriver = new ExtraFoodShopOrderRequestRetriver();
        FoodOrderRequest extraFoodShopOrderRequest = extraFoodShopOrderRequestRetriver.retrive();

        HealthyShopOrderRequestRetriver healthyShopOrderRequestRetriver = new HealthyShopOrderRequestRetriver();
        FoodOrderRequest healthyShopOrderRequest = healthyShopOrderRequestRetriver.retrive();

        GlutenFreeShopOrderRequestRetriver glutenFreeShopOrderRequestRetriver = new GlutenFreeShopOrderRequestRetriver();
        FoodOrderRequest glutenFreeShopOrderRequest = glutenFreeShopOrderRequestRetriver.retrive();

        OrderProcessor extraFoodShopOrderProcessor = new OrderProcessor(new ExtraFoodShopOrderService(), new WebFoodOrderRepository());
        extraFoodShopOrderProcessor.process(extraFoodShopOrderRequest);

        OrderProcessor healthyShopOrderProcessor = new OrderProcessor(new HealthyShopOrderService(), new WebFoodOrderRepository());
        healthyShopOrderProcessor.process(healthyShopOrderRequest);

        OrderProcessor glutenFreeShopOrderProcessor = new OrderProcessor(new GlutenFreeShopOrderService(), new WebFoodOrderRepository());
        glutenFreeShopOrderProcessor.process(glutenFreeShopOrderRequest);
    }
}
