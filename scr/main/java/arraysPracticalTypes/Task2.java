package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String[] array = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 8 lines: ");

        for (int i = 0; i < 8; i++) {
            array[i] = sc.nextLine();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }

//    public static String[] initializeArray() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 8 Strings:");
//
//        int num = 10;
//        String[] arr = new String[num]; // проинициализировали массив строк
//        for (int i = 0; i < 8; i++) {
//            arr[i] = sc.nextLine();
//        }
//        //return arr;
//        String[] arrReversed = new String[10];
//        for (int i = 10; i > 0; i--) {
//           arrReversed[i] = arr[i] ;
//        }
//        return arrReversed;
    }
//
//
//    public static String[] reverseArray(String[] arr) {
//
//        Collections.reverse(Arrays.asList(arr));
//        return arr;
//    }


