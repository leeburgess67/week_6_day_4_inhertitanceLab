package Staff;

public abstract class Employee {

    private String name;
    private String nationalInsurance;
    private double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public void raiseSalary(double increment) {
        double increase = (increment / 100) * this.salary;
        this.salary += increase;
    }

    public void payBonus() {
        double bonus = this.salary * .01;
        this.salary += bonus;
    }


    public double getSalary() {
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNationalInsurance(){
        return this.nationalInsurance;
    }
}