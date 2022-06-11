package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumberExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TestingMain {
    public static void main(String[] args) {

        LinkedList<Integer> oddNumbers = new LinkedList<>();
        oddNumbers.add(1);
        oddNumbers.add(4);
        oddNumbers.add(5);
        oddNumbers.add(12);
        oddNumbers.add(51);

        OddNumberExterminator numberExterminator = new OddNumberExterminator();
        numberExterminator.exterminate(oddNumbers);

        System.out.println(numberExterminator.exterminate(oddNumbers));
    }
}
