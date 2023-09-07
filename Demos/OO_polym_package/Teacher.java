package OO_polym_package;

public class Teacher extends Person {
    @Override
    public void show(){
        System.out.println("我是Teacher "+ getName() + " " + getAge());
    }
}
