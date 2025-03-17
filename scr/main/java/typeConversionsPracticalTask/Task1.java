package typeConversionsPracticalTask;

public class Task1 {
    public static void main (String [] args) {
Calculate calc = new Calculate();
calc.setResult(21, 8);
System.out.println("21 / 8 ="+" "+"целое число: "+calc.getQ()+" остаток: "+calc.getW());


    }
}
class Calculate{
private int q;
private int w;
private int a; // результат (целое число)
private int b; // результат (число после точки)
private double result;

public void setResult(int q, int w) {
    this.q = q;
    this.w = w;
    this.result = (double) q/w;
    this.a= (int)result; // присваиваем целое число результата (без остатка)
    this.b= q%w; // присваиваем остаток результата (без целого числа)
}
public int getQ() {
    return a;
}
public int getW() {
    return b;
}

}
