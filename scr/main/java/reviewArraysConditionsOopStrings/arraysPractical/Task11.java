package reviewArraysConditionsOopStrings.arraysPractical;
import java.util.Scanner;

public class Task11 {
    public static void main (String [] args){
        int [] array = createArray();
        int number = max(array);
        System.out.println(number);
    }

    public static int [] createArray(){
        int [] arr = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        for(int i = 0; i< arr.length; i++){
            int numbers = sc.nextInt();
            arr[i] = numbers;
        }
        return arr;
    }

    public static int max (int[] arr){
        int maxNum = 0;

        for(int i = 0; i<arr.length; i++){
            if (arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
}