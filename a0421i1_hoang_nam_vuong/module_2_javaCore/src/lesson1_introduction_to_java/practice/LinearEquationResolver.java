package lesson01_introduction_to_java.practice;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear equation resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Equation have solution is all !x");
            }else {
                System.out.println("Equation no solution");
            }
        }else {
            double equation = - b / a;
            System.out.println("Equation have one solution is: " + equation);
        }
    }
}
