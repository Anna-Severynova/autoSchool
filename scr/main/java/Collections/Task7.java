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