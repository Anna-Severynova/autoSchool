package restApiPracticalTask;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(setUniqueLangs());
        countPopulationByLang(setUniqueLangs());
    }

    public static Set<String> setUniqueLangs() {
        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .get("https://restcountries.com/v3.1/all?fields=name,languages");
        JsonPath jsonPath = response.jsonPath();

        // получаем весь массив стран - List из country-объектов
        List<Map<String, Object>> listAllCountries = jsonPath.getList("");

        //создаем Set для хранения всех уникальных языков
        Set<String> setUniqueLang = new HashSet<>();

        //чтобы достать languages, проходимся циклом по всем странам
        for (Map<String, Object> country : listAllCountries) {
            Map<String, String> mapLang = (Map<String, String>) country.get("languages");
            setUniqueLang.addAll(mapLang.keySet());
        }
        return setUniqueLang;
    }

    public static Map<String, Long> countPopulationByLang(Set<String> langs) {
        Map<String, Long> mapFinalResult = new HashMap<>();
        return null;
    }
    private static long findPopulationByLang(String lang) {//нахожу и суммирую популяцию по языку (For each language code get json from https://restcountries.com/v3/lang/[language code]. In the received json, summarize the population values)

        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .get("https://restcountries.com/v3.1/lang/" + lang);
        JsonPath jsonPath = response.jsonPath();
        List<Long> listAllPopulationByLang = jsonPath.getList("population");
        long sum = 0;
        for (Long population : listAllPopulationByLang) {
            population = sum;
            sum = population + sum;
        }
        return sum;
    }
}

