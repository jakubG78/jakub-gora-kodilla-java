package com.kodilla.good.patterns.challenges.food2door;

public interface FoodOrderRepository {
    public boolean createOrder(FoodSupplier foodSupplier, FoodItem foodItem);
}
