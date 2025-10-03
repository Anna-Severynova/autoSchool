package reflectionApiPracticalTask;

import java.lang.reflect.Field;

public class Parent {
    // заимплементить метод, который будет возвращать все поля классов-наследников
    public void printAllChildFields() throws IllegalAccessException {
        Class<?> myClass = this.getClass(); // получаем объект Class, который описывает реальный класс текущего объекта (наследника)
        Field[] fields = myClass.getDeclaredFields(); // получаем все объявленные поля этого класса
        for (Field field : fields) {
            field.setAccessible(true); // разрешаем доступ даже к приватным полям
            System.out.println(field.getName() + ": " + field.get(this));
        }
    }
}