package OO_extend_package;

public class Cook extends Employee {

    public Cook() {
    }

    public Cook(String jobId, String name, double salary) {
        super(jobId, name, salary);
    }

    public void work(){
        System.out.println("炒菜");
    }
    @Override
    public String toString() {
        return "Cook{jobId = " + this.getJobId() + ", name = " + this.getName() + ", salary = " + this.getSalary() + "}";
    }
}
