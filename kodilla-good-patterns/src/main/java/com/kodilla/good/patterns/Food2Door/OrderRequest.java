package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class OrderRequest {

    private final Product product;
    private final User user;
    private final LocalDateTime orderedTime;

    private final Producer producer;

    public OrderRequest(Product product, User user, LocalDateTime orderedTime, Producer producer) {
        this.product = product;
        this.user = user;
        this.orderedTime = orderedTime;
        this.producer = producer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderedTime() {
        return orderedTime;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }
}
