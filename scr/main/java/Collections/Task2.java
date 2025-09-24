//Task 2. HashMap from 10 pairs
//        1) Create a collection HashMap<String, String>, put there 10 pairs of strings: watermelon - berry, banana - herb, cherry - berry, pear - fruit, melon - vegetable, blackberry - bush, ginseng - root, strawberry - berry, iris - flower, potato - tuber.
//        2) Display the contents of the collection on the screen, each item on a new line.
//        3) Output examlpe (only one line is shown here):
//        potato - tuber

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