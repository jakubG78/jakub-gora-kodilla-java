package com.kodilla.good.patterns.challenges;

public class MobileOrderRepository implements OrderRepository {

    public boolean createOrder(User user, Item item, Double totalPrice) {
        System.out.println("Adding to repository mobile application order form: " + user.getName() + " " + user.getSurname());
        System.out.println("Order is containg " + item.getDescription() + " price of this item is " + item.getPrice() + " $");
        System.out.println("Total price of order is: " + totalPrice + " $");
        return true;
    }
}
