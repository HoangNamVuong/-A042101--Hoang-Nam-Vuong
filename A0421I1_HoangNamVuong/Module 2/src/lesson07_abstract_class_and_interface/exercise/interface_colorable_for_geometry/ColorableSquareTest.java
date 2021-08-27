package lesson07_abstract_class_and_interface.exercise.interface_colorable_for_geometry;

import lesson06_Inheritance.practice.object_geometry.Circle;
import lesson06_Inheritance.practice.object_geometry.Rectangle;
import lesson06_Inheritance.practice.object_geometry.Shape;
import lesson06_Inheritance.practice.object_geometry.Square;

public class ColorableSquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new ColorableSquare();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Square();
        for (Shape shape : shapes) {
            System.out.println(shape);

            if (shape instanceof ColorableSquare) {
                Colorable colorable = (Colorable) shape;
                colorable.howToColor();
            }
        }
    }
}
