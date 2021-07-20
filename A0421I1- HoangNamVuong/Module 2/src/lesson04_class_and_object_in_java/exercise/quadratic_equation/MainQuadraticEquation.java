package lesson04_class_and_object_in_java.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        double a = scanner.nextDouble();
        System.out.println("Enber number b:");
        double b = scanner.nextDouble();
        System.out.println("Enter number c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Quadratic equation have two roots: " + quadraticEquation.getRoot1() + " and " + + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Quadratic equation have one root: " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
