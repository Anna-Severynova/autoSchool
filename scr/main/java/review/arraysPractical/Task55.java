package review.arraysPractical;

import java.util.Arrays;
import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        int[] arrBig = new int[20];
        int[] arrSmall1 = new int[10];
        int[] arrSmall2 = new int[10];
        fillBigArr(arrBig);
        divideBigArr(arrBig, arrSmall1, arrSmall2);
    }

    public static void fillBigArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void divideBigArr(int[] arrBig, int[] arrSmall1, int[] arrSmall2) {

        for (int i = 0; i < arrBig.length / 2; i++) {
            arrSmall1[i] = arrBig[i];
            arrSmall2[i] = arrBig[i + 10];
        }
        System.out.println(Arrays.toString(arrSmall2));
    }
}
