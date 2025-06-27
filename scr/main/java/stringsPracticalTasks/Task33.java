package stringsPracticalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task33 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of the words with spaces:");
        String str = sc.nextLine();

        // split the string by spaces and get the array of words
        String [] strParts = str.split(" ");

        // create variable (int) for saving the longest word
        int longestWord = 0;
        // create variable (String) for saving the longest word
        String longestWord1 = "";

        for (int i = 0; i < strParts.length; i++){
            if(strParts[i].length()>longestWord){
                longestWord = strParts[i].length();
                longestWord1 = strParts[i];
            }
        }
        System.out.println("The longest word is: "+ longestWord1);
    }
}
