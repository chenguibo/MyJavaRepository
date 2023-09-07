package OO_extend_package;

public class Zhonghuadog extends Dog {
    public Zhonghuadog(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println("吃饭（吃剩饭）");
    }
}
