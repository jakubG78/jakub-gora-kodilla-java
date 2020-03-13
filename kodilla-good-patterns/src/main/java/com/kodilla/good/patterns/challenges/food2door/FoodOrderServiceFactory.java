package com.kodilla.good.patterns.challenges.food2door;

public class FoodOrderServiceFactory {
    public static FoodOrderService getOrderService(String orderServisName) {
        if(orderServisName.equals("ExtraFoodShop")) return new ExtraFoodShopOrderService();
        if(orderServisName.equals("HealthyShop")) return new HealthyShopOrderService();
        if(orderServisName.equals("GlutenFreeShop")) return new GlutenFreeShopOrderService();
        return null;
    }
}
