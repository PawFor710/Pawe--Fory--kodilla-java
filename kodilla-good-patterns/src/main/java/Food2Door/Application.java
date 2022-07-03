package Food2Door;

import com.kodilla.good.patterns.challenges.MailService;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetrieved orderRequestRetrieved = new OrderRequestRetrieved();
        OrderRequest orderRequest = orderRequestRetrieved.retrieve();

        ProductOrderingService productOrderingService = new ProductOrderingService(new MailSender(), new Shop(),
                new ShopRepository());
        productOrderingService.process(orderRequest);
    }
}
