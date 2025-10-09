package reviewArraysConditionsOopStrings.stringsPractical;

import java.util.Scanner;

public class Task22 {
    public static void main(String [] args){

        // enter and save the string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Main String:");
        String string = sc.nextLine();

        // enter and save substring that we want to change
        System.out.println("Enter the substring, that you want to change");
        String substring = sc.nextLine();

        // check that substring exists in the string
        if (string.contains(substring)){

            // if yes, then enter and save the new substring
            System.out.println("Enter the new substring:");
            String newSubstring = sc.nextLine();

            //replace substring to newSubstring in the Main string
            String result = string.replace(substring, newSubstring);
            System.out.println(result);
        }
        else{
            System.out.println("The string doesn't match with substring");
        }

    }
}
