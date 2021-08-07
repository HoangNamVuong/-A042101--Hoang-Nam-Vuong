package lesson07_abstract_class_and_interface.exercise.interface_resizeable_for_geometry;

import lesson06_Inheritance.practice.object_geometry.Square;

public class ResizeableSquare extends Square implements Resizeable{
    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }

    public ResizeableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }


    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth() + this.getWidth() * percent / 100);
        //this.setLength(this.getLength() + this.getLength() * percent / 100);
    }
}
