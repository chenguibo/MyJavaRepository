package OO_interface_package;

public class Cat extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void swim() {
        System.out.println("猫也会游泳");
    }
}
