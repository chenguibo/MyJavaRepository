package OO_polym_package;

public class Student extends Person {
    @Override
    public void show(){
        System.out.println("我是Student "+ getName() + " " + getAge());
    }
}
