package lesson07_abstract_class_and_interface.practice.interface_comparable_for_circle;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.*;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] arrayCircles = new ComparableCircle[3];
        arrayCircles[0] = new ComparableCircle(3.6);
        arrayCircles[1] = new ComparableCircle();
        arrayCircles[2] = new ComparableCircle(3.5,"black",false);

        System.out.println("Pre-sort:");
        for (ComparableCircle circle: arrayCircles) {
            System.out.println(circle);
        }

        Arrays.sort(arrayCircles);

        System.out.println("After-sort");
        for (ComparableCircle circle: arrayCircles) {
            System.out.println(circle);
        }
    }
}
