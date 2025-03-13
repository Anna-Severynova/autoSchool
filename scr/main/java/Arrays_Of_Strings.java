public class Arrays_Of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
     String[] strings = new String[3];// этот массив вмещает в себя 3 объекта класса стринг (3 строки)
        strings[0] = "Hello";
        strings[1] = "World";
        strings[2] = "Java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        // тип данных, переменная, массив через который хотим проходить
        for (String str : strings) {
            System.out.println(str);
        }


        //посчитать сумму массива
        int[] numbers2 = {8,2,3,4,5};
        int sum = 0;
        for (int n : numbers2){
            sum=sum+n;
        }
        System.out.println();
        System.out.println(sum);
    }
}
