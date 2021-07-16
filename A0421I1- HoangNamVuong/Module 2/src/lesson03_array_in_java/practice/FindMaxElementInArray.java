package lesson03_array_in_java.practice;

import java.util.Scanner;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array?");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element of array " + i);
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index += i;
            }
        }
        System.out.println("The largest property value in the list is: " + max + " at index is: " + index);

    }
}
