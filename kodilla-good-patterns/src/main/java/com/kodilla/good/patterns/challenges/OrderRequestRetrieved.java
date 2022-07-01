package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetrieved {

    public OrderRequest retrieve() {
        User user = new User("Michael", "Scott");

        LocalDateTime orderedAt = LocalDateTime.of(2022, 10, 5, 18, 5);
        LocalDateTime sendTime = LocalDateTime.of(2022, 10, 10, 8, 0);

        return new OrderRequest(user, orderedAt, sendTime);
    }
}
