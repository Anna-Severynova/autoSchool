package jUnit5;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2_Test {
    @Tag("addition")
    @DisplayName("Test for addition operation")
    @Test
    void addition() {
        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .queryParam("expr", "2+2")
                .get("https://api.mathjs.org/v4/");
        Double resultAddition = Double.parseDouble(response.asString().trim());
        assertEquals(4, resultAddition, "2+2 should equal 4");
    }

    @Tag("subtraction")
    @DisplayName("Test for subtraction operation")
    @Test
    void subtraction() {
        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .queryParam("expr", "5-3")
                .get("https://api.mathjs.org/v4/");
        Double resultSubtraction = Double.parseDouble(response.asString().trim());
        assertEquals(2, resultSubtraction, "5-3 should equal 2");
    }
}

//    @Tag("multiplication")
//    @DisplayName("Test for multiplication operation")
//    @Test
//    void multiplication() {
//
//    }
//
//    @Tag("division")
//    @DisplayName("Test for division operation")
//    @Test
//    void division() {
//
//    }
//
//    @Tag("square")
//    @DisplayName("Test for square operation")
//    @Test
//    void square() {
//
//    }
//
//
//}