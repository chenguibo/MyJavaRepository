package OO_extend_package;

public class Employee {
    private String jobId;
    private String name;
    private double salary;


    public Employee() {
    }

    public Employee(String jobId, String name, double salary) {
        this.jobId = jobId;
        this.name = name;
        this.salary = salary;
    }

    public void eat(){
        System.out.println("吃米饭");
    }

    /**
     * 获取
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * 设置
     * @param jobId
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

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

    /**
     * 获取
     * @return bonus
     */
    public double getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setSalary(double bonus) {
        this.salary = bonus;
    }

    public String toString() {
        return "Employee{jobId = " + jobId + ", name = " + name + ", salary = " + salary + "}";
    }
}
