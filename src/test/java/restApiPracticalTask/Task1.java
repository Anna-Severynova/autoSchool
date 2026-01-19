package restApiPracticalTask;


import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Response request = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .get("https://nghttp2.org/httpbin/anything");

        Map<String, Integer> mapURLandStatusCodes = new HashMap<>();
        int status = request.getStatusCode();
        if (status != 200) {
            mapURLandStatusCodes.put("https://nghttp2.org/httpbin/anything", request.getStatusCode());
        }

        Response request2 = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .get("https://nghttp2.org/httpbin/basic-auth/%7Buser%7D/%7Bpasswd%7D");

        int status2 = request2.getStatusCode();
        if (status2 != 200) {
            mapURLandStatusCodes.put("https://nghttp2.org/httpbin/basic-auth/%7Buser%7D/%7Bpasswd%7D", request2.getStatusCode());

        }
        System.out.println(mapURLandStatusCodes);
    }
}