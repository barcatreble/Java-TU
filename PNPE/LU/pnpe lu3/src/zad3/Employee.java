package zad3;

public abstract class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}
