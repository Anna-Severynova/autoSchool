package com.welcome;

public class Hello {

    private String name; // приватная переменная для хранения имени

    String setName(String username) {
        name = username;
        return name;
    }

    void welcome(){
        System.out.println("Welcome "+name);
    }

    void byBey(){
        System.out.println("Bye "+name);
    }
}
