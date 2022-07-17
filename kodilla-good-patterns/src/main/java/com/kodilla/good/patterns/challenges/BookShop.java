package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookShop implements OrderService {

    public boolean order(final User user, final LocalDateTime bookOrderedAt, final LocalDateTime bookSendTime) {
        System.out.println("Ordering book for: " + user.getName() + " " + user.getLastName()
        + "\nBook ordered at: " + bookOrderedAt.toString() + "\nBook will be send at: " + bookSendTime.toString());

        return true;
    }
}
