package conditionalOperatorsPracticalTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 names:");
        String name = sc.nextLine();
        String name1 = sc.nextLine();

        if(name.equalsIgnoreCase(name1)){
            System.out.println("The names are identical");
        }
        else{
            System.out.println("The names are not identical");
        }

        if(name.length()== name1.length()){
            System.out.println("The lengths of the names are equal");
        }
        else{
            System.out.println("The lengths of the names are not equal");
        }
    }
}
