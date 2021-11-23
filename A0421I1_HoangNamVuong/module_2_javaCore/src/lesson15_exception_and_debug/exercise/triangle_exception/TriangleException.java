package lesson15_exception_and_debug.exercise.triangle_exception;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        TriangleException triangleException = new TriangleException();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("Enter side 3: ");
        int side3 = scanner.nextInt();
        triangleException.checkTriangle(side1, side2, side3);
    }

    public static void checkTriangle(int side1, int side2, int side3) {

                try {
                    if (side1 >= side2 + side3)
                        throw new IllegalTriangleException();
                    else if (side2 >= side1 + side3)
                        throw new IllegalTriangleException();
                    else if (side3 >= side2 + side1)
                        throw new IllegalTriangleException();
                    else if (side1 < 0){
                        throw new IllegalTriangleException();
                    }
                    else if (side2 < 0){
                        throw new IllegalTriangleException();
                    }
                    else if (side3 < 0){
                        throw new IllegalTriangleException();
                    }

            } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                    System.out.println("please enter again: ");
        }
    }
}
