package lesson03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class DeleteElementInArrayByIndex {
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
        System.out.println("Enter index want delete:");
        int index = scanner.nextInt();
        for (int i = index; i < lengthArray; i++) {
            array[i] = array[i + 1];
            lengthArray--;
//            if (i == index) {
//                array[i] = array[i + 1];
//                lengthArray--;
//            }
        }
        System.out.println("Array after delete:");
        for (int i = 0; i < lengthArray; i++) {
            System.out.println(array[i]);
        }
    }
}
