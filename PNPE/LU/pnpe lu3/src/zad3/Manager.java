package zad3;

public class Manager extends Employee{
    Manager(String name, double baseSalary){
        super(name, baseSalary);
    }

    public double calculateSalary(){
        baseSalary *= 1.15;
        return baseSalary;
    }
}
