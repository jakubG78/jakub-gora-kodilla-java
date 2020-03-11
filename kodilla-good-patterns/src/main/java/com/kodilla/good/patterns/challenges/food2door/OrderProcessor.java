package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {

    private FoodOrderService foodOrderService;
    private FoodOrderRepository foodOrderRepository;

    public OrderProcessor(final FoodOrderService foodOrderService, final FoodOrderRepository foodOrderRepository) {
        this.foodOrderService = foodOrderService;
        this.foodOrderRepository = foodOrderRepository;
    }

    public FoodOrderDto process(final FoodOrderRequest foodOrderRequest) {
        boolean isOrderCompleted = foodOrderService.order(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem());

        if (isOrderCompleted) {
            foodOrderRepository.createOrder(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem());
            return new FoodOrderDto(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem(), true);
        } else {
            return new FoodOrderDto(foodOrderRequest.getFoodSupplier(), foodOrderRequest.getFoodItem(), false);
        }
    }

}
