package lesson02_loop_in_java.exercise;

import java.util.Scanner;

public class DrawGeometric {
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
            int width;
            int height;

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.print("height = ");
                    height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.print("height = ");
                    height = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= height; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.print("height = ");
                    height = scanner.nextInt();
                    System.out.print("width = ");
                    width = scanner.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}

