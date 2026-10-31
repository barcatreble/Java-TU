package zad1;

public class Main {
    static void main() {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("червено", 5.1);
        shapes[1] = new Circle("зелено", 2.3);
        shapes[2] = new Rectangle("синьо", 6.1, 4.2);
        shapes[3] = new Rectangle("жълто", 5.3, 6);
        shapes[4] = new Rectangle("бяло", 4, 5);

        Shape biggest = shapes[0];
        for (Shape shape : shapes){
            shape.printInfo();
            System.out.println();
            if(shape.calculateArea() > biggest.calculateArea()){
                biggest = shape;
            }
        }
        System.out.println("Фигура с най-голямо лице: ");
        biggest.printInfo();
    }
}
