package zad3;

public class Student extends Person{
    protected int facultyNumber;

    public Student(String name, int age, int facultyNumber){
        super(name, age);
        this.facultyNumber = facultyNumber;
    }

    public void printStudentInfo(){
        super.printPersonInfo();
        System.out.println("Fakulteten nomer: " + facultyNumber);
        System.out.println();
    }
}
