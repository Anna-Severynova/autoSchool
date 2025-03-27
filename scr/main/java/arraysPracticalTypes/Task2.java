package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] strings = initializeArray();
        System.out.println("Your string array: " + Arrays.toString(strings));

        System.out.println("Reverse array: "+Arrays.asList(reverseArray(strings)));
    }

    public static String[] initializeArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 Strings:");

        int num = 10;
        String[] arr = new String[num]; // проинициализировали массив строк
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public static String[] reverseArray(String[] arr) {

        Collections.reverse(Arrays.asList(arr));
        return arr;
    }
}

