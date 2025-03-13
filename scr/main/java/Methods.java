// У класса могут быть:
// Данные (ПОЛЯ)
// Действия, которые он может совершать (МЕТОДЫ)

public class Methods {
    // создадим несколько конкретных Person
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.name = "Joe";
        person.age = 22;

        // вызов метода
        person.sayHello();
        person.speak();


        Person1 person2 = new Person1();
        person2.name = "Jane";
        person2.age = 21;

        // вызов метода
        person2.sayHello();
        person2.speak();


    }
}

class Person1 {
    String name;
    int age;

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
}