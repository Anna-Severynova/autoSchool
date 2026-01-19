package restApiPracticalTask;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .accept("application/json")
                .get("https://nghttp2.org/httpbin/spec.json");
        JsonPath jsonPath = response.jsonPath();
        Map<String, Object> keysURL = jsonPath.getMap("paths"); // парсим Json чтобы собрать юрл (ключи)
        System.out.println(keysURL.keySet());
    }
}