package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class ShopRepository  implements OrderingRepository {
    @Override
    public boolean createOrder(User user, Product product, Producer producer, LocalDateTime orderedTime) {
        return true;
    }
}
