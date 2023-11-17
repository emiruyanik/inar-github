package week_11.assignments;

import week_10.assignments.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;

    public Employee() {
        MyDate myDate = new MyDate();
    }

    public Employee(String name,String address,String phoneNumber,String email,String office, double salary) {
        super(name,address,phoneNumber,email);
        this.office = office;
        this.salary = salary;
        MyDate myDate = new MyDate();
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "office='" + office + '\'' +
                ", salary=" + salary
                ;
    }
}
