package lesson06_Inheritance.exercise.triangle_more_of_shape;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(2,4,5);
        //Scanner scanner = new Scanner();
        //triangle.setColor(scanner.nextLine());
        triangle.setColor("black");
        System.out.println(triangle);
    }
}
