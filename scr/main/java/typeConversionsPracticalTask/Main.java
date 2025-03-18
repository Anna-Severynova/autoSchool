package typeConversionsPracticalTask;

import typeConversionsPracticalTask.calculate.Task1;
import typeConversionsPracticalTask.calculate.Task2;
import typeConversionsPracticalTask.calculate.Task3;
import typeConversionsPracticalTask.calculate.Task4;

public class Main {
    public static void main(String[] args) {
       // Task1 calculate = new Task1();
       // calculate.setResult(21, 8);
       // System.out.println("21 / 8 =" + " " + "целое число: " + calculate.getQ() + " остаток: " + calculate.getW());

        //Task2 calculate2 = new Task2();
       // calculate2.getScan();
       // calculate2.setDigits(calculate2.getScan());
       // System.out.println("Amount of the 2-digit numbers is: "+calculate2.getSum());

       // Task3 calculate3 = new Task3();
        // calculate3.setNumber1(calculate3.getScan1());
       // System.out.println(calculate3.getRound());

        Task4 calculate4 = new Task4();
        calculate4.getScanNum();
        //calculate4.getScanNum2();
        //calculate4.getScanNum3();
        int sumAB = calculate4.getSumAB();
        int subCA = calculate4.getSubCA();
        int sumABC = calculate4.getSumABC();
        System.out.println("a = "+sumAB+" "+ "b = "+subCA+" "+"c = "+sumABC);
    }
}
