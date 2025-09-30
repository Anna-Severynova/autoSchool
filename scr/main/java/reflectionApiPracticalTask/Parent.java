package reflectionApiPracticalTask;

import java.lang.reflect.Field;

public class Parent {
    // заимплементить метод, который будет возвращать все поля классов-наследников
    public void getAllChildFields(Object object) {
        try {
            Field getField = object.getClass().getDeclaredFields(); // получаем все поля объекта
            getField.setAccessible(true);
            Object obj = getField.get(object);

        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
