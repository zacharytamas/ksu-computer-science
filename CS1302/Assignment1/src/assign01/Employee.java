package assign01;

import java.util.Date;

public class Employee extends Person {

    private double salary;
    private Date dateHired;

    public Employee(String name, String email, double salary) {
        super(name, email);
        this.salary = salary;
        this.dateHired = new Date();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Date getDateHired() {
        return dateHired;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
