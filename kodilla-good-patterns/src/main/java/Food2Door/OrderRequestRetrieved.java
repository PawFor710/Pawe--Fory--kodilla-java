package Food2Door;

import java.time.LocalDateTime;

public class OrderRequestRetrieved {

    public OrderRequest retrieve() {
        User user = new User("Michael", "Scott");
        Producer producer = new Producer("ExtraFoodShop");
        Product product = new Product("apples", 10, true);

        LocalDateTime orderedTime = LocalDateTime.of(2022, 7, 15, 12, 19);

        return new OrderRequest(product, user, orderedTime, producer);
    }
}
