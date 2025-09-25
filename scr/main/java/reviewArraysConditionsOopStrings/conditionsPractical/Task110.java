package reviewArraysConditionsOopStrings.conditionsPractical;

import java.util.Scanner;

public class Task110 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter how many times to print the previous line: ");
        int num = sc.nextInt();

        while (num>0){
           System.out.println(str);
           num--;
        }
    }
}
