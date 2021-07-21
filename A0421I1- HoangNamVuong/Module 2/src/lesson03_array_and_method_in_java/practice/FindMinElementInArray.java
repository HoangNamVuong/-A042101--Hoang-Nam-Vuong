package lesson03_array_and_method_in_java.practice;

import java.util.Scanner;

public class FindMinElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element array(integer) " + i);
            array[i] = scanner.nextInt();
        }
        //inputArray();
        System.out.println("the min element in array is: " + minValue(array));
    }
//    public static int[] inputArray() {
//        Scanner scanner = new  Scanner(System.in);
//        System.out.println("Enter size array: ");
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Enter element " + i);
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
