public class Manager extends Employee{

    private String deptName;

    public Manager(String name, String deptName, String nationalInsurance , int salary){
        super(name, nationalInsurance, salary);
        this.deptName = deptName;

    }


    public String getDeptName() {
        return this.deptName;
    }
}
