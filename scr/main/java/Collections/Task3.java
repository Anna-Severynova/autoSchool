package Collections;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<Cat, String> mapCats = new HashMap<>();

        mapCats.put(new Cat("Barsik"), "cat");
        mapCats.put(new Cat("Murzik"), "cat");
        mapCats.put(new Cat("Bonya"), "cat");
        mapCats.put(new Cat("Basilio"), "cat");
        mapCats.put(new Cat("Tomas"), "cat");
        mapCats.put(new Cat("Frost"), "cat");
        mapCats.put(new Cat("Murka"), "cat");
        mapCats.put(new Cat("Murchik"), "cat");
        mapCats.put(new Cat("Meow"), "cat");
        mapCats.put(new Cat("Mur"), "cat");

        for (Map.Entry<Cat, String> cats : mapCats.entrySet()) {
            Cat keyCat = cats.getKey();
            String valueCat = cats.getValue();
            System.out.println(keyCat.name + " - " + valueCat);
        }
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }
    }
}
