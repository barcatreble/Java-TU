package zad3;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printPersonInfo(){
        System.out.println("Ime:" + name);
        System.out.println("Vuzrast: " + age);
    }
}
