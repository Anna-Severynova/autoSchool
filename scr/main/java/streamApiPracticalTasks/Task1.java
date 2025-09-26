//Task 1
//       1) Create a List<String> list not shorter than 50
//          elements of different length (filling is not important).
//       2) Add manually some empty elements ""
//       3) Output to the console using stream():
//          - the length of each of the list elements.
//          - non-empty list items not containing the d character
//          - list items in alphabetical order.

package streamApiPracticalTasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public  static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("aTest");
        list.add("");
        list.add("dTest11");
        list.add("bTest111");
        list.add("");
        list.add("mdTest");
        list.add("wTest1");
        list.add("qTest11");
        list.add("");
        list.add("wTestd1111");
        list.add("eTest");
        list.add("");
        list.add("rTest11");
        list.add("tTest111");
        list.add("");
        list.add("yTest");
        list.add("uTesdt1");
        list.add("iTest11");
        list.add("oTest111");
        list.add("pTest1111");
        list.add("dTest");
        list.add("rTest1");
        list.add("aTest11");
        list.add("sTest111");
        list.add("");
        list.add("dTest");
        list.add("fTest1");
        list.add("gTest11");
        list.add("hTest111");
        list.add("jTest1111");
        list.add("kTest");
        list.add("lTest1");
        list.add("zTest11");
        list.add("xTest111");
        list.add("cTest1111");
        list.add("vTest");
        list.add("bTest1");
        list.add("nTest11");
        list.add("");
        list.add("mTest1111");
        list.add("mTest");
        list.add("rTest1");
        list.add("tTest11");
        list.add("mTest111");
        list.add("");
        list.add("nTest");
        list.add("rTest1");
        list.add("qTest11");
        list.add("dTest111");
        list.add("aTest1111");

        list.stream()
                .filter(a -> !a.contains("d") && !a.contains("D") && !a.isEmpty())
                .map(a -> a + ": " + a.length() + " -- is lenght of the string")
                .sorted()
                .forEach(System.out::println);


    }
}
