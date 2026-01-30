package jUnit5;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Task11_Test {

    private Map<String, Integer> urlAndStatusCode;

    @BeforeEach
    void basicLogic() {

        urlAndStatusCode = new HashMap<>();

        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .accept("application/json")
                .get("https://nghttp2.org/httpbin/spec.json");
        JsonPath jsonPath = response.jsonPath();
        Map<String, Object> keysURL = jsonPath.getMap("paths"); // парсим Json чтобы собрать юрл (ключи)
        Set<String> endpoints = keysURL.keySet();

        Map<String, Integer> urlAndStatusCode = new HashMap<>();
        for (String endpoint : endpoints) {
            String safeEndpoint = endpoint
                    .replace("{", "%7B")
                    .replace("}", "%7D"); //конвертируем ендроинты с параметрами в "читабельный" для Rest Assured вид
            Response response1 = RestAssured.given()
                    .urlEncodingEnabled(false)
                    .header("User-Agent", "Learning Automation")
                    .get("https://nghttp2.org/httpbin" + safeEndpoint);
            int statusCode = response1.getStatusCode();
            if (statusCode != 200) {
                urlAndStatusCode.put("https://nghttp2.org/httpbin" + safeEndpoint, response1.getStatusCode());
            }
        }
        System.out.println(urlAndStatusCode);
    }

    @Test
    void testNON200Codes() {
        for (Integer statusCode : urlAndStatusCode.values()) {
            assertNotEquals(
                    200,
                    statusCode,
                    "Map contains endpoint with 200 status code"
            );
        }
    }
}