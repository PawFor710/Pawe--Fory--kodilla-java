package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderedAt;
    private LocalDateTime sendTime;

    public OrderRequest(User user, LocalDateTime orderedAt, LocalDateTime sendTime) {
        this.user = user;
        this.orderedAt = orderedAt;
        this.sendTime = sendTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }
}
