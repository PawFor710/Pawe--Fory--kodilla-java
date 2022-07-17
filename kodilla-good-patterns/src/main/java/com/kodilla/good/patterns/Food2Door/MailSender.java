package com.kodilla.good.patterns.Food2Door;

public class MailSender implements OrderInformation {

    @Override
    public void inform(Product product, User user, Producer producer) {
        System.out.println("Hi! " + user.getName() + " " + user.getLastName() + "."
        + "\nYou just ordered " + product.getQuantityOfProduct() + "x " + product.getNameOfProduct() +
                " from " + producer.getProducerName());
    }
}


