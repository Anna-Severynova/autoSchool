package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> mapPlants = new HashMap<>();

        mapPlants.put("watermelon", "berry");
        mapPlants.put("banana", "herb");
        mapPlants.put("cherry", "berry");
        mapPlants.put("pear", "fruit");
        mapPlants.put("melon", "vegetable");
        mapPlants.put("blackberry", "bush");
        mapPlants.put("ginseng", "root");
        mapPlants.put("strawberry", "berry");
        mapPlants.put("iris", "flower");
        mapPlants.put("potato", "tuber");

        for(Map.Entry <String, String> plants : mapPlants.entrySet()){
            String keyPlants = plants.getKey();
            String valuePlants = plants.getValue();
            System.out.println(keyPlants + " - " + valuePlants);
        }
    }
}