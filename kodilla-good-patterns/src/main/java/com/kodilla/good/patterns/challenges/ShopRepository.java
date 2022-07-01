package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ShopRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderedAt, LocalDateTime sendTime) {
        return true;
    }
}
