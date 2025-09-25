//Task 9. The Shortest line
//        1) Create a list of strings.
//        2) Read 5 strings from the keyboard and add them to the list.
//        3) Using a loop, find the shortest string in the list.
//        4) Display the found string on the screen.
//        5) If there are several such lines, print each line from a new line

package collectionsPracticalTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 strings: ");

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        int min = Integer.MAX_VALUE;
        for (String str : list) {
            if (str.length() < min) {
                min = str.length();
            }
        }

        List<String> newList = new ArrayList<>();
        for (String str : list) {
            if (min == str.length()) {
                newList.add(str);
            }
        }
        System.out.println("The string(s) with min symbols: ");
        for(String str: newList){
            System.out.println(str);
        }
    }
}
