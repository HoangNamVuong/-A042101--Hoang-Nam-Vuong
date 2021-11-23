package lesson05_access_modifier_static_method_static_property.exercise.access_modifier_1;

public class MainTestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());;
    }
}
