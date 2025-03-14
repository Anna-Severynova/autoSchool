package autoSchool;

// желательно чтобы поля были видны только в пределах одного класса

public class SetGet {
    public static void main(String[] args) {
        Students student = new Students();
        Students student2 = new Students();

        // сетеры присваивают значение полям класса. геттеры - возвращают
        student.setName("");
        student.setAge(-1);

        // выводим значения в мейн методе
        System.out.println("Name is"+ " " + student.getName());
        System.out.println("Age is" + " " + student.getAge());


    }

}

class Students {

    // два поля, и 4 метода - предназначенные для этих полей

    private String name;
    private int age;

    // в сеттерах можно проверять корректность ввода
    public void setName(String username) {
        // проверяем что имя != null
        if (username.isEmpty()){
            System.out.println("Name is empty");
        } else {
            name = username;}
    }

    public String getName(){
        return name;
        }

    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("Age is not valid");
        } else{
        age = userAge;}
        }

    public int getAge(){
        return age;
        }
    }

