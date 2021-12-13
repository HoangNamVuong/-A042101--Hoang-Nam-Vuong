package lesson03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element:" + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("We have a array:");
        for (int a : array) {
            System.out.println(a);
        }

        int lengthArray = array.length;
        System.out.println("Enter index want add:");
        int index = scanner.nextInt();
        System.out.println("Enter value want add:");
        int value = scanner.nextInt();

        for (int i = index; i < lengthArray-1; i++) {
            array[i + 1] = array[i];
            array[i] = value;
            lengthArray++;
            break;
        }
        System.out.println("Array after add:");
        for (int i = 0; i < lengthArray-1; i++) {
            System.out.println(array[i]);
        }
    }
}
