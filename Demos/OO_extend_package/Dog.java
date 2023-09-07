package OO_extend_package;

public class Dog {
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }


    // 吃饭
    public void eat(){
        System.out.println("吃饭");
    }

    public void drink(){
        System.out.println("喝水");
    }

    public void lookHouse(){
        System.out.println("看家");
    }
}
