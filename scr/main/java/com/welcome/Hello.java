package com.welcome;

public class Hello {

    private String name; // приватная переменная для хранения имени

    // метод для установки имени
    public void setName(String username) {
        this.name = username;
    }

    // метод для вывода Приветствие + имя
    public void welcome(){
        System.out.println("Welcome "+name);
    }

    //метод для вывода Прощание + имя
    public void byeBay(){
        System.out.println("Bye "+name);
    }
}
