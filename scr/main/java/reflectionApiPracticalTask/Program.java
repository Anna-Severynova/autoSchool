package reflectionApiPracticalTask;

import java.lang.reflect.Field;
import java.util.UUID;

public class Program {
    public static void populateFieldsWithRandomData(Object object) throws IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields(); // получаем все объявленные поля текущего класса (массив класса Field)
        for (Field field : fields) {
            if (field.getType().equals(String.class)) {
                field.setAccessible(true); // позволяет взаимодействовать с приватными полями и, например, присвоить любое значение, как в следующей строке кода
                field.set(object, UUID.randomUUID().toString());
            }
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Child_Person person = new Child_Person();
        populateFieldsWithRandomData(person);
        person.printAllChildFields();

        Child_Employee employee = new Child_Employee();
        populateFieldsWithRandomData(employee);
        employee.printAllChildFields();

        Child_Student student = new Child_Student();
        populateFieldsWithRandomData(student);
        student.printAllChildFields();
    }
}