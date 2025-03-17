package typeConversionsPracticalTask;

public class Task1 {
    public static void main (String [] args) {
Calculate calc = new Calculate();
calc.setQ(21, 8);
System.out.println("21 / 8 ="+" "+"целое число: "+calc.getQ()+" остаток: "+calc.getQ());


    }
}
class Calculate{
private int q;
private int w;
private int a; // результат (целое число)
private int b; // результат (число после точки)

public void setQ(int q, int w) {
    this.q = q;
    this.w = w;
    this.a= q/w; // присваиваем целое число результата (без остатка)
    this.b= q%w; // присваиваем остаток результата (без целого числа)
}
public int getQ() {
    return a;
}
public int getW() {
    return b;
}

}
