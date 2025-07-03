package autoSchool;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        HelloWorld hello = new HelloWorld();
        hello.printHelloName();
    }
    void printHelloName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String myString = sc.nextLine();
        System.out.println("Hello, "+ myString);
    }
}