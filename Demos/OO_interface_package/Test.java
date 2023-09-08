package OO_interface_package;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("狗狗");
        d.eat();
        d.swim();

        Cat c = new Cat();
        c.setName("猫猫");
        c.eat();
        c.swim();
    }
}
