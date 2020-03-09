package com.kodilla.good.patterns.challenges;

public interface OrderRepository {
    public boolean createOrder(User user, Item item, Double totalPrice);
}
