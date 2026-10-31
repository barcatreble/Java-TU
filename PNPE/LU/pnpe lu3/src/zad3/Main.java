package zad3;

public class Main {
    static void main() {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Ivan", 1800);
        employees[1] = new Manager("Todor", 2700);
        employees[2] = new Developer("Boris", 1000, 6);
        employees[3] = new Developer("Kiril", 900, 12);
        employees[4] = new Developer("Simeon", 1200, 0);

        Employee withBiggestSalary = employees[0];
        for(Employee e : employees){
            System.out.print("Ime: " + e.name);
            System.out.println();
            System.out.printf("Zaplata: %.2flv\n", e.baseSalary);
            System.out.println();
            if(e.baseSalary > withBiggestSalary.baseSalary) withBiggestSalary = e;
        }

        System.out.println("Slujitel s nai-golqma zaplata: ");
        System.out.println("Ime: " + withBiggestSalary.name);
        System.out.printf("Zaplata: %.2flv\n", withBiggestSalary.baseSalary);
    }
}
