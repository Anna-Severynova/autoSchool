//Task 8. The Longest line
//        1) Create a list of strings.
//        2) Read 5 strings from the keyboard and add them to the list.
//        3) Using a loop, find the longest string in the list.
//        4) Display the found string on the screen.
//        5) If there are several such lines, print each line from a new line.

package collectionsPracticalTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 strings: ");

        for (int i = 0; i<5; i++){
            stringList.add(sc.nextLine());
        }

        int max = 0;
        for (String str : stringList) {
            if (str.length() > max) {
                max = str.length();
            }
        }

        List<String> arrForMaxElement = new ArrayList<>();
        for (String str : stringList) {
            if (max == str.length()) {
                arrForMaxElement.add(str);
            }
        }
        System.out.println("The longest string(s): ");

        for (String str: arrForMaxElement){
            System.out.println(str);
        }
    }
}