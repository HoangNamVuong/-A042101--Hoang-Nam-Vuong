package lesson07_abstract_class_and_interface.exercise.interface_resizeable_for_geometry;

import lesson06_Inheritance.practice.object_geometry.Rectangle;

public class ResizeableRectangle extends Rectangle implements Resizeable {
    public ResizeableRectangle() {
    }

    public ResizeableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizeableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth() + this.getWidth() * percent / 100);
        this.setLength(this.getLength() + this.getLength() * percent / 100);
    }
}
