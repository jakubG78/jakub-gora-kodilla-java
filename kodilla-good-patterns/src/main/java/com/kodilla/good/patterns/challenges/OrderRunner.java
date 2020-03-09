package com.kodilla.good.patterns.challenges;

public class OrderRunner {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(), new MobileOrderService(), new MobileOrderRepository());
        productOrderService.process(orderRequest);
    }
}
