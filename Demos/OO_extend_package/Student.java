package OO_extend_package;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public void drink(){
        System.out.println("我是学生，我要喝饮料！");
    }
    @Override
    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
