package lesson03_array_and_method_in_java.practice;

import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.println("Enter a size?");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size do not exceed 20");
            }
        }while (size > 20);

        int[] array = new int[size];
        for (int i = 0; i < array.length;i++) {
            System.out.println("Enter element array " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Elements in array is:");
        //System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Reverse array is:");
        //System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }

}
