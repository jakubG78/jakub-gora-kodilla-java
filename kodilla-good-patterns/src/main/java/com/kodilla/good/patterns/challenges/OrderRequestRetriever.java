package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Dan", "Nugget", "90210 Beverly Hills");
        Item item = new Item("Basketball", 9.99, "Spalding Pro 2000 basketball");
        Double totalPrice = 9.99;

        return new OrderRequest(user, item, totalPrice);
    }
}
