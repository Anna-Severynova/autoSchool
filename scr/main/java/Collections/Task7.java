//Task 7. 5 different lines in the list
//        1) Create a list of lines.
//        2) Add 5 different lines to it.
//        3) Display its size on the screen.
//        4) Using a loop, display its contents on the screen, each value on a new line

package Collections;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main (String [] args){

        List<String> list = new ArrayList<String>();

        list.add("Test");
        list.add("Test1");
        list.add("Test11");
        list.add("Test111");
        list.add("Test1111");

        System.out.println("Size of array: " + list.size());

        for(String outputList : list){
            System.out.println(outputList);
        }
    }
}