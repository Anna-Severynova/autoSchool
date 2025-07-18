package Collections;

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
        System.out.println("The longest string(s): " + arrForMaxElement);
    }
}