package lesson06_Inheritance.exercise.point_and_moveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        // test class Point
        Point point = new Point(1,4);
        System.out.println(point);

        // test class MoveablePoint
        MoveablePoint moveablePoint = new MoveablePoint(1,4,5,7);
        System.out.println(moveablePoint);

        System.out.println(moveablePoint.move());
    }
}
