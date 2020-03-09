package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Item item;
    private Double totalPrice;

    public OrderRequest(User user, Item item, Double totalPrice) {
        this.user = user;
        this.item = item;
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }
}
