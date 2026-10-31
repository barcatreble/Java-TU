package zad1;

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return width * height;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (width + height);
    }

    @Override
    public void printInfo(){
        System.out.println("Цвят: " + color);
        System.out.println("Страни: " + width + ", " + height);
        System.out.println("Лице: " + calculateArea());
        System.out.println("Площ: " + calculatePerimeter());
        System.out.println();
    }
}
