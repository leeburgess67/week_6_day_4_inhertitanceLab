public abstract class Employee {

    private String name;
    private String nationalInsurance;
    private double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public void raiseSalary(double increment){
        this.salary += increment;

    }

    public void payBonus(){
        double bonus = this.salary * .01;
        this.salary += bonus;
    }


}
