package basicCommandForTesting.task2JUnit;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicOperations {
    private String baseURL = "https://api.mathjs.org/v4/";
    private String baseHeader = "Learning Automation";

    public Double basicOperation(String expr) {
        Response response = RestAssured.given()
                .header("User-Agent", baseHeader)
                .queryParam("expr", expr)
                .get(baseURL);

        Double result = Double.parseDouble(response.asString().trim());
        return result;
    }

    public void print(String expr, String symbols, Double exprResult) {
        System.out.println(expr + symbols+ exprResult);
    }
}
