package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private FoodOrderService foodOrderService;
    private FoodOrderRequest foodOrderRequest;
    private FoodOrderRepository foodOrderRepository;


    public OrderProcessor(final FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }

    public FoodOrderDto process(final FoodSupplier foodSupplier) {
        foodOrderRequest = new FoodOrderRequest(foodSupplier, null);
        if (foodSupplier.getName().equals("ExtraFoodShop")) {
            ExtraFoodShopOrderRequestRetriver extraFoodShopOrderRequestRetriver = new ExtraFoodShopOrderRequestRetriver();
            foodOrderRequest = extraFoodShopOrderRequestRetriver.retrive();
            foodOrderService = new ExtraFoodShopOrderService();
        } else {
            if (foodSupplier.getName().equals("HealthyShop")) {
                HealthyShopOrderRequestRetriver healthyShopOrderRequestRetriver = new HealthyShopOrderRequestRetriver();
                foodOrderRequest = healthyShopOrderRequestRetriver.retrive();
                foodOrderService = new HealthyShopOrderService();
            } else {
                if (foodSupplier.getName().equals("GlutenFreeShop")) {
                    GlutenFreeShopOrderRequestRetriver glutenFreeShopOrderRequestRetriver = new GlutenFreeShopOrderRequestRetriver();
                    foodOrderRequest = glutenFreeShopOrderRequestRetriver.retrive();
                    foodOrderService = new GlutenFreeShopOrderService();
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
