package autoSchool;

public class Arrays {
    public static void main(String[] args) {
        // создание массива
        int[] numbers = new int[10]; // int[10] - размер массива
        //используем цикл for для инициализации массива
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
        }
    // вывод массива на экран
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    //  второй способ создания массива (с конкретными значениями)
        System.out.println(" ");

        int[] numbers2 = {1,2,3,4,5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

    }


}
