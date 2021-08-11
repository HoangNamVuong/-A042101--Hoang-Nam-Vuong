package lesson02_loop_in_java.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scanner.nextInt();
        System.out.println("Enter number b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("no greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor is: " + a);
    }

    public static class DrawingMenu {
        public static void main(String[] args) {
            int choice = -1;
            while (choice != 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Menu");
                System.out.println("1. Draw the triangle");
                System.out.println("2. Draw the square");
                System.out.println("3. Draw the rectangle");
                System.out.println("0. Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Draw the triangle");
                        System.out.println("******");
                        System.out.println("*****");
                        System.out.println("****");
                        System.out.println("***");
                        System.out.println("**");
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("Draw the square");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 3:
                        System.out.println("Draw the rectangle");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        System.out.println("* * * * * *");
                        break;
                    case 0:
                        System.exit(0); // dung de dung chuong trinh ngay lap tuc.
                    default:
                        System.out.println("No choice");
                }
            }
        }
    }
}
