package Assigment_9;
abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() { return salary; }

    public void display() {
        System.out.println(id + " " + name);
    }

    abstract double calculateSalary();
}

interface Department {
    void assign(String d);
}

class FullTime extends Employee implements Department {
    public FullTime(int id, String name, double salary) {
        super(id, name, salary);
    }

    double calculateSalary() { return getSalary(); }

    public void assign(String d) {}
}

class PartTime extends Employee implements Department {
    private int hours;
    private double rate;

    public PartTime(int id, String name, int h, double r) {
        super(id, name, 0);
        hours = h;
        rate = r;
    }

    double calculateSalary() { return hours * rate; }

    public void assign(String d) {}
}

public class Q1_EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new FullTime(1,"Aman",50000);
        Employee e2 = new PartTime(2,"Ravi",100,200);

        e1.display();
        System.out.println(e1.calculateSalary());

        e2.display();
        System.out.println(e2.calculateSalary());
    }
}