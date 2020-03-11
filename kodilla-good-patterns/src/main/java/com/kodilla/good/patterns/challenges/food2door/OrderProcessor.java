package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private FoodOrderService foodOrderService;
    private FoodOrderRepository foodOrderRepository;

    public OrderProcessor(final FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }

    public FoodOrderDto process(final FoodSupplier foodSupplier) {
        FoodOrderRequest foodOrderRequest = new FoodOrderRequest(foodSupplier, null);
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
