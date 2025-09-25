package conditionalOperatorsPracticalTasks;

import java.util.Scanner;

public class Task5_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age<0){
            System.out.println("Incorrect age");
        }
        else if(age<=18){
            System.out.println("Grow up more");
        }
        else if(age>=20){
            System.out.println("18 is enough");
        }
    }
}
