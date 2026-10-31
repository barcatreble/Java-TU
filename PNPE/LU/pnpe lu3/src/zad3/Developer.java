package zad3;

public class Developer extends Employee{
    int overtimeHours;
    Developer(String name, double baseSalary, int overtimeHours){
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary(){
        baseSalary += overtimeHours * 20;
        return baseSalary;
    }
}
