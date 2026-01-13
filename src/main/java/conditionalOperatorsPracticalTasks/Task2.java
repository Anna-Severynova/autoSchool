package conditionalOperatorsPracticalTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a<b&&a<c&&a<d){
            System.out.println("The min number is "+a);
        }
        else if(b<a&&b<c&&b<d){
            System.out.println("The min number is "+b);
        }
        else if(c<a&&c<b&&c<d){
            System.out.println("The min number is "+c);
        }
        else{
            System.out.println("The min number is "+d);
        }
    }
}
