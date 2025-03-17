package TypeConversions.calculations;

public class Task4 {

    public void printValues(int a, int b, int c) {
//        System.out.println("a = " + (a + b) + ", b = " + (a - b) + ", c = " + (a + b + c));
        int newValueA = changeValueA(a, b);
        int newValueB = changeValueB(a, b);
        int newValueC = changeValueC(a, b, c);

        System.out.println("a = " + newValueA + ", b = " + newValueB + ", c = " + newValueC);
    }

    public int changeValueA(int a, int b) {
        return a + b;
    }

    public int changeValueB(int a, int b) {
        return a - b;
    }

    public int changeValueC(int a, int b, int c) {
        return a + b + c ;
    }
}
