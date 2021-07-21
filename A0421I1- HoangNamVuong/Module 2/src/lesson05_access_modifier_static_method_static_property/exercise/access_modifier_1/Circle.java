package lesson05_access_modifier_static_method_static_property.exercise.access_modifier_1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public double PI = 3.14;

    public Circle() {
    }
    public Circle(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius * radius * PI;
    }
}
