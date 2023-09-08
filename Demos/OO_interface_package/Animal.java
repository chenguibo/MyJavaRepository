package OO_interface_package;

public abstract class Animal {
    private String name;


    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal{name = " + name + "}";
    }
}
