package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.util.Objects;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();
        // Start of test1 "SimpleUser"
        System.out.println("Mój pierwszy test jednostkowy: ");

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }



        // Start of test2 "Calculator"
        System.out.println("\nTest kalkulatora: ");

        Calculator calculator = new Calculator(10, 5);
        
        Integer adding = calculator.addAtoB();
        Integer added = calculator.getA() + calculator.getB();
        Integer subtract = calculator.subtractBfromA();
        Integer subtracted = calculator.getA() - calculator.getB();

        
        // Jednostkowy test dodawania
        if (adding.equals(added)) {
            System.out.println("Adding test is OK!");
        } else {
            System.out.println("ERROR");
        }

        // Jednostkowy test odejmowania
        if (subtract.equals(subtracted)) {
            System.out.println("Subtracting test is OK!");
        } else {
            System.out.println("ERROR");
        }
    }
}
