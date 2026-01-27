package jUnit5;

import basicCommandForTesting.task2JUnit.BasicOperations;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2_Test {
    BasicOperations basicOperation = new BasicOperations();

    @BeforeEach
    void expr(){

    }

    @Tag("addition")
    @DisplayName("Test for addition operation")
    @Test
    void addition() {
        Double expr = basicOperation.basicOperation("5-3");
        assertEquals(4, basicOperation.basicOperation("2+2"), "2+2 should equal 4");
        basicOperation.print("2+2: ", expr, " = 4");
    }

    @Tag("subtraction")
    @DisplayName("Test for subtraction operation")
    @Test
    void subtraction() {
        Double expr = basicOperation.basicOperation("5-3");
        assertEquals(2, expr, "5-3 should equal 2");
        basicOperation.print("5-3: ", expr, " = 2");
    }

    @Tag("multiplication")
    @DisplayName("Test for multiplication operation")
    @Test
    void multiplication() {
        Double expr = basicOperation.basicOperation("5*5");
        assertEquals(25, expr, "5*5 should equal 25");
        basicOperation.print("5*5: ", expr, " = 25");
    }

    @Tag("division")
    @DisplayName("Test for division operation")
    @Test
    void division() {
        Double expr = basicOperation.basicOperation("16/4");
        assertEquals(4, expr, "16/4 should equal 4");
        basicOperation.print("16/4: ", expr, " = 4");
    }

    @Tag("square")
    @DisplayName("Test for square operation")
    @Test
    void square() {
        Double expr = basicOperation.basicOperation("sqrt(25)");
        assertEquals(5, expr, "sqrt(25) should equal 5");
        basicOperation.print("sqrt(4): ", expr, " = 5");
    }
}