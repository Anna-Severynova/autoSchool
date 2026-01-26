package basicCommandForTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class UniqueLangs {
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

    public void soutLangs(Set<String> result) {
        System.out.println(result);
    }
}