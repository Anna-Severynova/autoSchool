package arraysPracticalTypes;

import java.util.Scanner;

public class Task11 {
    public static void main (String [] args){
        initializeArray();
        System.out.println(initializeArray());

    }

    public static int [] initializeArray(){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [20];

        for(int i = 0; i< arr.length; i++){
            arr[i] = numbers;
        }
        return arr;
    }
}
