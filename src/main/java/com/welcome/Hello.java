package com.welcome;

import java.util.Scanner;

public class Hello {
    private String name;
    public void setupName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
    }
  public void welcome(){
       System.out.println("Hello, "+name);
   }
  public void byeBye(){
        System.out.println("Bye, "+name);
   }
}
