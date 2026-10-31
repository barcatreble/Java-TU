package zad1;

public abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void printInfo(){
        System.out.println("Цвят: " + color);
        System.out.println("Лице: " + calculateArea());
        System.out.println("Площ: " + calculatePerimeter());
    }
}
