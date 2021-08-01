package lesson06_Inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle{
    private double height;

    Cylinder() {
        super();
        this.height = 1;
    }

    Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        return Math.PI * getRadius() * getRadius() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder has height = " + getHeight()
                + " and volume = " + volume()
                + " extends " + super.toString();
    }
}
