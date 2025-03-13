package autoSchool;// У класса могут быть:
// Данные (ПОЛЯ)
// Действия, которые он может совершать (МЕТОДЫ)

public class Methods {
    // создадим несколько конкретных Person
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.setName("Joe");//person.name = "Joe";
        person.age = 22;

        // вызов метода
        //person.sayHello();
        person.speak();

        Person1 person2 = new Person1();
        String s1 = "Jane";//person2.name = "Jane";
        person2.setName(s1);
        person2.age = 21;

        // вызов метода
        //person2.sayHello();
        person2.speak();

        // тип метода int
        //int year1 = person.calculateYearsToRetirement();
        //int year2 = person2.calculateYearsToRetirement();
        //System.out.println("First person is "+ year1);
        //System.out.println("Second person is "+ year2);

    }
}

class Person1 {

    String name;
    int age;
    int years;

    // создаем метод для того, чтобы человек представился
    void speak(){
        // вывести приветствие 3 раза
        //for (int i=0; i<4; i++){
            System.out.println("My name is " + name + "," + "and age is " + age);
        //}
    }

    void sayHello(){
        System.out.println("Hello");
    }

    int calculateYearsToRetirement(){
        int years = 65-age;
        return years;
    }

    //параметры метода
    void setName(String username){
        name = username;
    }
}