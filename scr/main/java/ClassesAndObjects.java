// У класса могут быть:
// Данные (ПОЛЯ)
// Действия, которые он может совершать (МЕТОДЫ)

public class ClassesAndObjects {
    // создадим несколько конкретных Person
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Joe";
        person.age = 22;
        System.out.println("My name is "+ person.name + "," + "and age is "+ person.age);

        Person person2 = new Person();
        person2.name = "Jane";
        person2.age = 21;
        System.out.println("My name is "+ person2.name + "," + "and age is "+ person2.age);

    }
}

class Person {
    String name;
    int age;
}