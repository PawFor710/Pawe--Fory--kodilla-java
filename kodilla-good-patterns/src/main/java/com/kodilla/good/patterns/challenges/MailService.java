package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Hello " + user.getName() + "!" + "\nYou just ordered a book!");
    }
}
