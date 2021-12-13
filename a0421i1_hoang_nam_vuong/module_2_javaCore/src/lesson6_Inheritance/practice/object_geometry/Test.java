package lesson06_Inheritance.practice.object_geometry;

public class Test {
    public static void main(String[] args) {
        // test class Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5,"black",false);
        System.out.println(circle);

        //test class Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4);
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4,"orange",true);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea() + " and " + rectangle.getPerimeter());

        //test class Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(2);
        System.out.println(square);

        square = new Square(2,"yellow",true);
        System.out.println(square);
    }
}
