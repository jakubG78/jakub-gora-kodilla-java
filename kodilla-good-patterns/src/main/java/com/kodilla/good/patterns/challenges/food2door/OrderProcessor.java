package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private FoodOrderService foodOrderService;
    private FoodOrderRequest foodOrderRequest;
    private FoodOrderRepository foodOrderRepository;


    public OrderProcessor(final FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }

    public FoodOrderDto process(String suplierName) {
        FoodSupplier foodSupplier = new FoodSupplier(suplierName);
        foodOrderRequest = new FoodOrderRequest(foodSupplier, null);
        foodOrderService = FoodOrderServiceFactory.getOrderService(foodSupplier.getName());
        if (foodSupplier.getName().equals("ExtraFoodShop")) {
            ExtraFoodShopOrderRequestRetriver extraFoodShopOrderRequestRetriver = new ExtraFoodShopOrderRequestRetriver();
            foodOrderRequest = extraFoodShopOrderRequestRetriver.retrive();
        } else {
            if (foodSupplier.getName().equals("HealthyShop")) {
                HealthyShopOrderRequestRetriver healthyShopOrderRequestRetriver = new HealthyShopOrderRequestRetriver();
                foodOrderRequest = healthyShopOrderRequestRetriver.retrive();
            } else {
                if (foodSupplier.getName().equals("GlutenFreeShop")) {
                    GlutenFreeShopOrderRequestRetriver glutenFreeShopOrderRequestRetriver = new GlutenFreeShopOrderRequestRetriver();
                    foodOrderRequest = glutenFreeShopOrderRequestRetriver.retrive();
                }
            }
        }

        boolean isOrderCompleted = foodOrderService.order(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem());

        if (isOrderCompleted) {
            foodOrderRepository.createOrder(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem());
            return new FoodOrderDto(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem(), true);
        } else {
            return new FoodOrderDto(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem(), false);
        }
    }
}
