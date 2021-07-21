package lesson03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class DeleteElementInArrayByValue {
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
        delete(array);
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] delete(int... array) {
        Scanner scanner = new Scanner(System.in);
        int lengthArray = array.length;
        System.out.println("Enter element want delete:");
        int elementDelete = scanner.nextInt();
        for (int i = 0; i < lengthArray; i++) {
            while (array[i] == elementDelete) {
                if (i == lengthArray - 1) {
                    lengthArray--;
                    break;
                } else {
                    for (int j = i; j < lengthArray - 1; j++) {
                        array[j] = array[j + 1];
                    }
                    lengthArray--;
                }
            }
        }
        return array;
    }
}
