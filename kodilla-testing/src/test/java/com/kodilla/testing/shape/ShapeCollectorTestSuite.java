package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

@DisplayName("TDD: Shape Test Suite")
public class ShapeCollectorTestSuite {

    private static int counter = 0;
    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @BeforeEach
    public void beforeEveryTest() {
        counter++;
        System.out.println("Prepering to execute test");
    }
    @Nested
    @DisplayName("Test for adding figures method")
    class TestAddingFigures {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 4.00);
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapesQuantity());
        }
    }
    @Nested
    @DisplayName("Test for getting shape from list")
    class TestGettingFigure {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 4.00);
            Shape circle = new Circle("Circle", 12.56);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            //When
            Shape resultTest = shapeCollector.getFigure(1);
            //Then
            Assertions.assertEquals("Circle", resultTest.getShapeName());
        }
    }
    @Nested
    @DisplayName("Test for removing figures method")
    class TestRemovingFigures {
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square", 4.00);
            //When
            shapeCollector.removeFigure(square);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapesQuantity());
        }
    }
    @Nested
    @DisplayName("Test for returning every figures' name")
    class TestReturningFigures {
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Square square = new Square("Square", 4.00);
            Circle circle = new Circle("Circle", 12.56);
            Triangle triangle = new Triangle("Triangle", 4.00);
            //When
            String result = square.getName() + " " + circle.getName() + " " + triangle.getName();
            String resultCollector = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(resultCollector, result);
        }
    }
}
