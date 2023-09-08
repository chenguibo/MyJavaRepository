package OO_interface_package;

public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }
}
