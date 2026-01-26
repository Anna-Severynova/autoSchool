package jUnit5;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Task33_Test {
    @Test
    @DisplayName("setUniqueLangs method returns only unique languages")
    public void shouldReturnOnlyUniqueLanguages() {
        System.out.println();
        System.out.println("Task 3.1: Return the unique languages.");
        System.out.println();
        System.out.println(setUniqueLangs());
        Set<String> languages = setUniqueLangs();
        Map<String, Long> populations = countPopulationByLang(languages);//в Map сохраняю метод(с арг Сета из уник.яз. Этот метод: проходит по всему Сету уник.языков, и кладет в результирующую Мапу язык + сумму популяции (которую получаем через приватный метод))
        System.out.println();
        System.out.println("Task 3.2: Count the sum of populations by languages.");
        System.out.println();
        System.out.println(populations);

        //вызываем метод, который тестируем
        Set<String> result = setUniqueLangs();

        //1й тест - провеверяем, что метод возвращает NOT null
        assertNotNull(
                result,
                "Languages should NOT be null"
        );

        //2й тест - проверяем языки на уникальность
        List<String> languagesList = new ArrayList<>(languages);

        assertEquals(
                languagesList.size(),
                new HashSet<>(languagesList).size(),
                "Languages set should contain only unique values"
        );
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