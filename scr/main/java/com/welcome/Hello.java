package com.welcome;

public class Hello {

    private String name; // приватная переменная для хранения имени

    public void setName(String username) { //
        this.name = username;
    }
    public void welcome(){
        System.out.println("Welcome "+name);
    }

    public void byeBay(){
        System.out.println("Bye "+name);
    }
}
