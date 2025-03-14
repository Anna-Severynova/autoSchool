package autoSchool;

public class SetGet {
    public static void main(String[] args) {
        Students student = new Students();
        Students student2 = new Students();
        student.setName("Anna");
        student.setAge(23);
        student.getName();
        student.getAge();

    }

}

class Students {

    // два поля, и 4 метода - предназначенные для этих полей

    private String name;
    private int age;

    public void setName(String username) {
        name = username;
    }

    public String getName(){
        return name;
        }

    public void setAge(int userAge){
        age = userAge;
        }

    public int getAge(){
        return age;
        }
    }

