package lesson03_array_in_java.exercise;

import java.util.Scanner;

public class MergeTwoArray {
    public static void main(String[] args) {
        System.out.println("Enter array1:");
        int[] array1 = enterArray();
        System.out.println("Enter array2:");
        int[] array2 = enterArray();
        int[] array3 = new int[array2.length + array1.length];
        sumArray(array1,array2,array3);
        for (int i = 0; i < array3.length; i++) {
            System.out.println("Array 3 is: " + array3[i]);
        }
    }
    public static int[] enterArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element:" + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] sumArray(int[] array1,int[] array2,int[] array3) {
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        return array3;
    }
}
