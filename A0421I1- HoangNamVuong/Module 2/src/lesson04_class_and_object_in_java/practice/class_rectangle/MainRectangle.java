package lesson04_class_and_object_in_java.practice.class_rectangle;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width:");
        int width = scanner.nextInt();
        System.out.println("Enter the height");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle is: " + rectangle.display());
        System.out.println("Perimeter of the rectangle is: " + rectangle.getPrimeter());
        System.out.println("Area of the rectangle is: " + rectangle.getArea());
    }
}

