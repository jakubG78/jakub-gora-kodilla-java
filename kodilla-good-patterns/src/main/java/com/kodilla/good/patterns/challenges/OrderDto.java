package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public User user;
    public boolean isOrderCompleted;

    public OrderDto(User user, boolean isOrderCompleted) {
        this.user = user;
        this.isOrderCompleted = isOrderCompleted;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderCompleted() {
        return isOrderCompleted;
    }
}
