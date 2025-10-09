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
        return a + b;
    }

    public int getSubCA(){
        return c - a;
    }

    public int getSumABC(){
        return a + b + c;
    }
}
