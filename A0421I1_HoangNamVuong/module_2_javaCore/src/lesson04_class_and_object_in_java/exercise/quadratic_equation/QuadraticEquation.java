package lesson04_class_and_object_in_java.exercise.quadratic_equation;

public class QuadraticEquation {
    double a, b, c, delta, r1, r2;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        delta = (this.b * this.b) - 4 * this.a * this.c;
        return delta;
    }
    public double getRoot1() {
        r1 = (- this.b + Math.pow(delta,0.5)) / (2 * this.a);
        return r1;
    }
    public double getRoot2() {
        r2 = (- this.b - Math.pow(delta,0.5)) / (2 * this.a);
        return r2;
    }
}
