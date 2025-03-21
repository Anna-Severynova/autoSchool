package typeConversionsPracticalTask.calculate;

import java.util.Scanner;

public class Task4 {
    int a;
    int b;
    int c;

    public void getScan2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an 'a': ");
        a = sc.nextInt();
    }
    public void getScan3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an 'b': ");
        b = sc.nextInt();
    }
    public void getScan4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an 'c': ");
        c = sc.nextInt();
    }

    public int getSumAB(){
        int num1 = a + b;
        return num1;
    }

    public int getSubCA(){
        int num2 = c - a;
        return num2;
    }

    public int getSumABC(){
        int num3 = a + b + c;
        return num3;
    }
}
