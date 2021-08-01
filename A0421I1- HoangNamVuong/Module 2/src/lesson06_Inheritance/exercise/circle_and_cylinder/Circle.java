package lesson06_Inheritance.exercise.circle_and_cylinder;

public class Circle {
    private double radius = 1;
     String color = "green";

    Circle() {
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double setArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return " a class Circle has radius " + getRadius() + " with color " + getColor();
    }
}
