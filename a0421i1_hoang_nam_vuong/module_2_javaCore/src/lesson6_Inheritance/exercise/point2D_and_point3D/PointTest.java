package lesson06_Inheritance.exercise.point2D_and_point3D;

public class PointTest {
    public static void main(String[] args) {
        // test class Point2D
        Point2D point2D = new Point2D();
        System.out.println(point2D.toString());
        point2D = new Point2D(2,5);
        System.out.println(point2D.toString());

        // test class Point3D
        Point3D point3D = new Point3D();
        System.out.println(point3D.toString());
        point3D = new Point3D(1,2,3);
        System.out.println(point3D.toString());
    }
}
