package OO_polym_package;

public class Admin extends Person{
    @Override
    public void show(){
        System.out.println("我是Admin "+ getName() + " " + getAge());
    }
}
