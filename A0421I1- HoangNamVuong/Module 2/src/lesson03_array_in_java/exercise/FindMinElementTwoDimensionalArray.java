package lesson03_array_in_java.exercise;

import java.util.Scanner;

public class FindMinElementTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array1 = enterArray();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println("Array1 is: " + array1[i][j]);
            }
        }
        System.out.println("Min of array1 is: " + maxArray(array1));
    }

    public static int[][] enterArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        System.out.println("Enter element of size:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }

    public static int maxArray(int[][] array1) {
        int min = array1[0][0];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] < min) {
                    min = array1[i][j];
                }
            }
        }
        return min;
    }
}
