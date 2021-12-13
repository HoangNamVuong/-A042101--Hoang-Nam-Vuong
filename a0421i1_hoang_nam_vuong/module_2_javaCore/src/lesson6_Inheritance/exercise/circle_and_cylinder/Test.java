package lesson06_Inheritance.exercise.circle_and_cylinder;

public class Test {
    public static void main(String[] args) {
        // test class Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(2,"black");
        System.out.println(circle);

        // test class Cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2,"black",2.5);
        System.out.println(cylinder);
    }
}
