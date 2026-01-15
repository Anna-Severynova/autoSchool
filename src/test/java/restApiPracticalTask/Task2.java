package restApiPracticalTask;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //шаг 5: заполняем мапы для реквеста и методом responseBodyHeaders получаем нужные элементы респонса
        Task2 task2 = new Task2();
        Map<String, String> mapHeadersRequest = new HashMap<>();
        Map<String, String> mapBodyRequest = new HashMap<>();
        mapHeadersRequest.put("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/143.0.0.0 Safari/537.36");
        mapBodyRequest.put("comments", "test instruction");
        mapBodyRequest.put("custemail", "test_email@test.test");
        mapBodyRequest.put("custname", "Anna");
        mapBodyRequest.put("custtel", "382054564");
        mapBodyRequest.put("delivery", "17:45");
        mapBodyRequest.put("size", "large");
        mapBodyRequest.put("topping", "mushroom");
        System.out.println(task2.responseBodyHeaders(mapHeadersRequest, mapBodyRequest));
    }

    public List<Map<String, String>> responseBodyHeaders(Map<String, String> mapDataHeaders, Map<String, String> mapDataBody) {

        //шаг 1: отправляем Post запрос c headers и body, переданными в метод
        Response response = RestAssured.given()
                .headers(mapDataHeaders) // метод, который может принять Map из множества хедеров (для request)
                .formParams(mapDataBody)// метод, который может принимать Map body (для request)
                .post("http://httpbin.org/post");

        // шаг 2: Из response берем определенную часть body респонса (form) и "превращаем" его в Мар
        JsonPath jsonPath = response.jsonPath(); // .jsonPath() — это доступ к JSON внутри response; jsonPath — это объект, через который мы: читаем body & достаём form

        Map<String, String> mapForm = jsonPath.getMap("form");// парсим form; преобразовываем в Map

        //шаг 3: Из response получаем headers в виде списка Header
        // response.getHeaders();// тут получаю объект типа Headers. каждый объект типа Headers это поле с двумя полями name & value. List<Header> в каком-то смысле эквивалентен Map<String, String>
        List<Header> headersList = response.getHeaders().asList(); // кладу объект типа Headers в List, преобразовав его в массив (.asList). headerList - это List, каждый список элемента - это Header (name : value).

        //шаг 4: Преобразуем список Header в Map<String, String> -> циклом заполняем пустой Мар значениеями из headerList
        Map<String, String> mapHeaders = new HashMap<>();
        for (Header header : headersList) {
            mapHeaders.put(header.getName(), header.getValue());
        }
        return List.of(mapHeaders, mapForm);
    }
}