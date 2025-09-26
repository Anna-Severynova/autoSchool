//Task 1
//       1) Create a List<String> list not shorter than 50 elements
//       of different length (filling is not important).
//       2) Add manually some empty elements ""
//       3) Output to the console using stream():
//          - the length of each of the list elements.
//          - non-empty list items not containing the d character
//          - list items in alphabetical order.

package streamApiPracticalTasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1 DTest");
        list.add("");
        list.add("x3 dTest11");
        list.add("m4 Test111");
        list.add("");
        list.add("k6 dTest");
        list.add("q7 Test1");
        list.add("t8 Test11");
        list.add("");
        list.add("y9 Testd1111");
        list.add("u10 Test");
        list.add("");
        list.add("i12 Test11");
        list.add("o13 Test111");
        list.add("");
        list.add("p15 Test");
        list.add("a16 Tesdt1");
        list.add("s17 Test11");
        list.add("d18 Test111");
        list.add("f19 Test1111");
        list.add("g20 dTest");
        list.add("h21 Test1");
        list.add("j21 Test11");
        list.add("k23 Test111");
        list.add("");
        list.add("l24 Test");
        list.add("z25 Test1");
        list.add("x26 Test11");
        list.add("c27 Test111");
        list.add("v28 Test1111");
        list.add("b29 Test");
        list.add("n30 Test1");
        list.add("m31 Test11");
        list.add("q32 Test111");
        list.add("w33 Test1111");
        list.add("e34 Test");
        list.add("r35 Test1");
        list.add("t36 Test11");
        list.add("");
        list.add("y38 Test1111");
        list.add("u39 Test11111111111111111111111");
        list.add("i40 Test1");
        list.add("a41 Test111");
        list.add("c42 Test11111111111111");
        list.add("");
        list.add("h44 Test");
        list.add("b45 Test1");
        list.add("z46 Test1111");
        list.add("x47 dTest111");
        list.add("c48 Test1111");
        list.add("v49 dTest111");
        list.add("b50 DTest111111111111");

        list.stream()
                .filter(a -> !a.contains("d") && !a.contains("D") && !a.isEmpty())
                .map(a -> a + ": " + a.length() + " -- is lenght of the string")
                .sorted()
                .forEach(System.out::println);
    }
}