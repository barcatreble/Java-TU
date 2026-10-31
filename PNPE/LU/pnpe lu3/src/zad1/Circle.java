package zad1;

public class Circle extends Shape{
    double radius;

    Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public  double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }

    @Override
    public void printInfo(){
        System.out.println("Цвят: " + color);
        System.out.println("Радиус: " + radius);
        System.out.println("Лице: " + calculateArea());
        System.out.println("Площ: " + calculatePerimeter());
        System.out.println();
    }
}