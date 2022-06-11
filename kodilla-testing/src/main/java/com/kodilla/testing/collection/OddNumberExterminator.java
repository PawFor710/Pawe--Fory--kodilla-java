package com.kodilla.testing.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class OddNumberExterminator {
    public List<Integer> exterminate(LinkedList<Integer> numbers) {
        List<Integer> abc = new LinkedList<>();
        for (int n = 0; n < numbers.size(); n++) {
            if(numbers.get(n) % 2 ==0) {
                abc.add(numbers.get(n));
            }
        }
        return abc;
    }
}
