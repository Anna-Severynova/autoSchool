package jUnit5;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class Task22_Test {
    @Test
    @DisplayName("POST request returns part of response body(form data) and ALL response headers")
    void shouldReturnFormAndResponseHeaders() {
        Map<String, String> mapHeadersRequest = new HashMap<>();
        Map<String, String> mapBodyRequest = new HashMap<>();
        mapHeadersRequest.put("User-Agent", "Learning Automation");
        mapBodyRequest.put("comments", "test instruction");
        mapBodyRequest.put("custemail", "test_email@test.test");
        mapBodyRequest.put("custname", "Anna");
        mapBodyRequest.put("custtel", "382054564");
        mapBodyRequest.put("delivery", "17:45");
        mapBodyRequest.put("size", "large");
        mapBodyRequest.put("topping", "mushroom");
        System.out.println(responseBodyHeaders(mapHeadersRequest, mapBodyRequest));

        List<Map<String, String>> result = responseBodyHeaders(mapHeadersRequest,mapBodyRequest);

        //проверяем, что скрипт возвращает 2 мапы
        assertEquals(
                2,
                result.size(),
                "Script should return two maps: response headers and response body (form)"
        );
    }
    public List<Map<String, String>> responseBodyHeaders(Map<String, String> mapDataHeaders, Map<String, String> mapDataBody) {

        Response response = RestAssured.given()
                .headers(mapDataHeaders)
                .formParams(mapDataBody)
                .post("http://httpbin.org/post");
        JsonPath jsonPath = response.jsonPath();
        Map<String, String> mapForm = jsonPath.getMap("form");
        List<Header> headersList = response.getHeaders().asList();
        Map<String, String> mapHeaders = new HashMap<>();
        for (Header header : headersList) {
            mapHeaders.put(header.getName(), header.getValue());
        }
        return List.of(mapHeaders, mapForm);
    }
}