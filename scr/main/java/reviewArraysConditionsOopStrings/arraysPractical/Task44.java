package reviewArraysConditionsOopStrings.arraysPractical;

import java.util.Arrays;
import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        int[] arrInt = new int[5];
        fillArrInt(arrInt);
        reverseArrInt(arrInt);
    }

    public static void fillArrInt(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void reverseArrInt(int[] arrRev) {
        int[] reverseArr = new int[arrRev.length]; // создаем массив для хранения перевернутого массива
        int j = 0;
        for (int i = arrRev.length - 1; i >= 0; i--) {
            reverseArr[j] = arrRev[i];
            j++;
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
