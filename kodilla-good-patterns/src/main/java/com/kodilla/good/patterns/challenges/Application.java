package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetrieved orderRequestRetrieved = new OrderRequestRetrieved();
        OrderRequest orderRequest = orderRequestRetrieved.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new BookShop(), new ShopRepository());
        productOrderService.process(orderRequest);
    }
}
