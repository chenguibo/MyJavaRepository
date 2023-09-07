package OO_extend_package;

public class OOTest {
    public static void main(String[] args) {
//        Student s1 = new Student("cgb", 25);
//        System.out.println(s1.toString()); // Student{name = cgb, age = 25}
//        s1.drink(); // 我是学生，我要喝饮料！
//
//        Hashiqi h1 = new Hashiqi("哈士奇");
//        System.out.println(h1.name);
//        h1.eat();
//        h1.drink();
//        h1.lookHouse();
//        h1.pushHouse();
//
//        Shapigou sha1 = new Shapigou("沙皮狗");
//        System.out.println(sha1.name);
//        sha1.eat();
//        sha1.drink();
//        sha1.lookHouse();
//
//        Zhonghuadog zh1 = new Zhonghuadog("中华田园犬");
//        System.out.println(zh1.name);
//        zh1.eat();
//        zh1.drink();
//        zh1.lookHouse();

        Manager m1 = new Manager("1", "mmm", 10000, 100000);
        System.out.println(m1.toString()); // Employee{jobId = 1, name = mmm, salary = 10000.0, bonus = 100000.0}
        m1.work(); // 管理其他人
        m1.eat(); // 吃米饭

        Cook c1 = new Cook("2", "ccc", 1000);
        System.out.println(c1.toString()); // Cook{jobId = 2, name = ccc, salary = 1000.0}
        c1.work(); // 炒菜
        c1.eat(); // 吃米饭

    }
}
