package lesson07_abstract_class_and_interface.practice.interface_comparable_for_circle;

import lesson06_Inheritance.practice.object_geometry.Circle;
//import java.util.Comparator;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle comparableCircle) {
        if (getRadius() > comparableCircle.getRadius()) {
            return 1;
        }else if (getRadius() < comparableCircle.getRadius()) {
            return -1;
        }else {
            return 0;
        }
    }
}
