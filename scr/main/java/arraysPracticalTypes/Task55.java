package arraysPracticalTypes;

import java.util.Arrays;
import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        int[] arrBig = createArrBig();
        int[] arrSmall1 = createArrSmall();
        int[] arrSmall2 = createArrSmall();
        fillBigArr(arrBig);
        divideBigArr(arrBig, arrSmall1, arrSmall2);
        printSmallArr2(arrSmall2);
    }

    public static int[] createArrBig() {
        return new int[20];
    }

    public static int[] createArrSmall() {
        return new int[10];
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
    }

    public static void printSmallArr2(int[]arr){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
