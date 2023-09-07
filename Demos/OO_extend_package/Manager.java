package OO_extend_package;

public class Manager extends Employee {
    private double bonus;


    public Manager() {
    }

    public Manager(String jobId, String name, double salary, double bonus) {
        super(jobId, name, salary);
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("管理其他人");
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{jobId = " + this.getJobId() + ", name = " + this.getName() + ", salary = " + this.getSalary() + ", bonus = " + this.getBonus() + "}";
    }
}
