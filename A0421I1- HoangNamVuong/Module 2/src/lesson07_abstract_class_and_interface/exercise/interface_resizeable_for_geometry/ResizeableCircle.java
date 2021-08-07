package lesson07_abstract_class_and_interface.exercise.interface_resizeable_for_geometry;

import lesson06_Inheritance.practice.object_geometry.Circle;

import java.util.Scanner;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius() + this.getRadius() * percent / 100);
    }
}
