package week_12.assignments;

import week_09.live_class.F;

public class Faculty {
    private String name;
    private String surname;
    private String rank;
    private double salary;
    public Faculty(){

    }
    public Faculty(String name,String surname,String rank,double salary){
        this.name=name;
        this.surname=surname;
        this.rank=rank;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return
                 name  +" " + surname + " " + rank +" " + salary;




    }
}
