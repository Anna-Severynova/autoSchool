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
        Set<String> endpoints = keysURL.keySet();

        // создаем цикл, который будет:
        //   1 - проходить по каждому элементу Set.
        //   2 - вызывать каждый ендпоинт
        //   3 - проверять статус код
        //   4 - если НЕ 200 - сохранять юрл и статус коды в Мапу
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
            if (statusCode!=200){
               urlAndStatusCode.put("https://nghttp2.org/httpbin"+safeEndpoint, response1.getStatusCode());
            }
        }
        System.out.println(urlAndStatusCode);
    }
}