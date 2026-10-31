package zad3;

public class Main {
    public static void main() {
        Person person1 = new Person("Shmiril", 30);
        person1.printPersonInfo();

        Student student1 = new Student("Ivan", 20, 1312);
        Student student2 = new Student("Daniel", 22, 4276);
        student1.printStudentInfo();
        student2.printStudentInfo();
    }
}
