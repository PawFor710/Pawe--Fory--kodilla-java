package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetrieved orderRequestRetrieved = new OrderRequestRetrieved();
        OrderRequest orderRequest = orderRequestRetrieved.retrieve();

        ProductOrderingService productOrderingService = new ProductOrderingService(new MailSender(), new Shop(),
                new ShopRepository());
        productOrderingService.process(orderRequest);
    }
}
