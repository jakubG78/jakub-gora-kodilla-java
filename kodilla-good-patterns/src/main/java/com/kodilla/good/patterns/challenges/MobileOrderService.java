package com.kodilla.good.patterns.challenges;

public class MobileOrderService implements OrderService {

    public boolean order(User user, Item item, Double totalPrice) {
        System.out.println("Processing mobile application order form: " + user.getName());
        System.out.println("Ordering " + item.getDescription() + " for total price of " + totalPrice + " $");
        return true;
    }
}
