package lesson06_Inheritance.exercise.triangle_more_of_shape;

import lesson06_Inheritance.practice.object_geometry.Shape;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;


    Triangle() {
    }

    Triangle(double side1,double side2,double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter *((halfPerimeter - side1)*(halfPerimeter - side2)*(halfPerimeter - side3)));
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return "A triangle with side:"+side1+","+side2+","+side3+"," +
                " area is = "+getArea()+", perimeter = "+getPerimeter()+"" +
                ", extends "+super.toString()+" ";
    }
}
