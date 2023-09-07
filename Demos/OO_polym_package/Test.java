package OO_polym_package;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("sss");
        s.setAge(18);
        register(s);

        Teacher t = new Teacher();
        t.setName("ttt");
        t.setAge(38);
        register(t);

        Admin a = new Admin();
        a.setName("aaa");
        a.setAge(50);
        register(a);

        Person p1 = new Student();
        System.out.println(p1 instanceof Student); // true
        System.out.println(p1 instanceof Person); // true
        System.out.println(p1 instanceof Teacher); // false
    }

    public static void register(Person p){
        p.show();
    }
}
