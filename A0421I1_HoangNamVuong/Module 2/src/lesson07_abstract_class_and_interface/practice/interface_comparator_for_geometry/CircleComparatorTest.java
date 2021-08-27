package lesson07_abstract_class_and_interface.practice.interface_comparator_for_geometry;

import lesson06_Inheritance.practice.object_geometry.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"black",false);
        System.out.println("Pre-sort");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("After-sort");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
