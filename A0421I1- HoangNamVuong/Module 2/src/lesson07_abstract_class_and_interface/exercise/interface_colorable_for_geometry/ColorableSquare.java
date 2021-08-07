package lesson07_abstract_class_and_interface.exercise.interface_colorable_for_geometry;

import lesson06_Inheritance.practice.object_geometry.Square;

public class ColorableSquare extends Square implements Colorable {
    public ColorableSquare() {
    }

    public ColorableSquare(double side) {
        super(side);
    }

    public ColorableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public String toString() {
        return "Area of ColorableSquare is: " + getArea();
    }
}
