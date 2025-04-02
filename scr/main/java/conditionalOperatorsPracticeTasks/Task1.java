package conditionalOperatorsPracticeTasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a>b){
            System.out.println("The min number is "+b);
        }
        else{
            System.out.println("The min number is "+a);
        }
    }
}
