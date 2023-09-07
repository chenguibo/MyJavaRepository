package OO_extend_package;

public class Hashiqi extends Dog {
    public Hashiqi(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("吃饭（吃狗粮）");
    }

    public void pushHouse(){
        System.out.println("拆家");
    }
}
