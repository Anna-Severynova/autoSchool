package conditionsPracticalTask.review;

import java.util.Scanner;

public class Task117 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String string = sc.nextLine();

        for(int i = 0; i<10; i++){
            System.out.println(string+", I love you");
        }
    }
}
