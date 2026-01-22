package restApiPracticalTask;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(setUniqueLangs());
        Set<String> languages = setUniqueLangs();
        Map<String, Long> populations = countPopulationByLang(languages);//в Map сохраняю метод(с арг Сета из уник.яз. Этот метод: проходит по всему Сету уник.языков, и кладет в результирующую Мапу язык + сумму популяции (которую получаем через приватный метод))
        System.out.println(populations);
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
        for (String lang : langs) {
            mapFinalResult.put(lang, findPopulationByLang(lang));
        }
        return mapFinalResult;
    }

    private static long findPopulationByLang(String lang) {//нахожу и суммирую популяцию по языку (For each language code get json from https://restcountries.com/v3/lang/[language code]. In the received json, summarize the population values)

        Response response = RestAssured.given()
                .header("User-Agent", "Learning Automation")
                .get("https://restcountries.com/v3.1/lang/" + lang);
        JsonPath jsonPath = response.jsonPath();
        List<Number> listAllPopulationByLang = jsonPath.getList("population");

        long sum = 0;
        for (Number population : listAllPopulationByLang) {
            sum = sum + population.longValue();
        }
        return sum;
    }
}