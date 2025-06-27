package stringsPracticalTasks;

public class Task11 {
    public static void main(String [] args){
        String string = "Hello,World. Hello, World!!";

        // find first, last and middle symbol
        System.out.println("The first symbol: "+string.charAt(0));
        System.out.println("The last symbol: "+string.charAt(string.length()- 1));

        int lenght = string.length();
        if (lenght % 2 != 0){
            int middleSymbol = lenght/2;
            System.out.println("The middle symbol: "+string.charAt(middleSymbol));
        }
        else {
            System.out.println("There is impossible to find a middle symbol");
        }

        // find a part of the string before dot (include dot)
        int dotIndex = string.indexOf(".");
        System.out.println("A part of the string before dot (include dot)"+string.substring(0,dotIndex+1));

        // calculate spaces
        int totalSpaces = string.length() - string.replace(" ", "").length();
        System.out.println("Total spaces: " + totalSpaces);
    }
}
