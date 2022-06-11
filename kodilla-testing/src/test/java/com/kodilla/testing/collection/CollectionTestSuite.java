package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void  before() {
        System.out.println("Unit Test: Start");
    }

    @AfterEach
    public void after() {
        System.out.println("Unit Test: End");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("The beginning of the tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("End of testing");
    }

    @DisplayName("Test sprawdzający czy klasa zachowuje się poprawnie, gdy lista jest pusta")

    @Test
    void testOddNumbersExterminatorEmptyList() {

        LinkedList<Integer> emptyList = new LinkedList<>();
        LinkedList<Integer> testList = new LinkedList<>();

        OddNumberExterminator emptyNumbers = new OddNumberExterminator();
        LinkedList<Integer> result = (LinkedList<Integer>) emptyNumbers.exterminate(emptyList);
        System.out.println("Testing: emptyList");

        Assertions.assertEquals(testList,result);
    }

    @DisplayName("Test sprawdzający czy klasa zachowuje się poprawnie," +
                "gdy lista zawiera liczby parzyste i nieparzyste")
    @Test
    void testOddNumbersExterminatorNormalList() {
        LinkedList<Integer> normalList = new LinkedList<>();
        normalList.add(1);
        normalList.add(4);
        normalList.add(5);
        normalList.add(12);
        normalList.add(51);
        LinkedList<Integer> testNormalList = new LinkedList<>();
        testNormalList.add(4);
        testNormalList.add(12);

        OddNumberExterminator normalNumbers = new OddNumberExterminator();
        LinkedList<Integer> resultNormal = (LinkedList<Integer>) normalNumbers.exterminate(normalList);
        System.out.println("Testing: normalList");

        Assertions.assertEquals(testNormalList, resultNormal);
    }
}
