package OO_extend_package;

public class Shapigou extends Dog{
    public Shapigou(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("吃饭（吃狗粮、吃骨头）");
    }
}
