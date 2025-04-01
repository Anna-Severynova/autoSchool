package conditionalOperatorsPracticeTasks;

public class Task11 {
    public static void main(String[] args) {
        String s = new String("S");

        int i = 10; // переменная для строк
        while (i > 0) {
            int j = 10; // количество символов в строке
            while (j > 0) {
                System.out.print(s);
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
