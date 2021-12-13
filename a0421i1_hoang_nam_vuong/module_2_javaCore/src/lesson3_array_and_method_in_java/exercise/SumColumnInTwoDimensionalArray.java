package lesson03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class SumColumnInTwoDimensionalArray {
    public static void main(String[] args) {
        FindMaxElementTwoDimensionalArray input = new FindMaxElementTwoDimensionalArray();
        int[][] array1 = input.enterArray();
        int column;
        Scanner scanner = new Scanner(System.in);
        do {
            column = scanner.nextInt();
        }while (column < 0 || column >= array1.length);
        System.out.println("Sum of column " + column + " is: " + sum(column, array1));
    }
    public static int sum(int column, int[][] array1) {
        int sum = 0;
        for (int i = column; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum += array1[i][j];
            }
            break;
        }
        return sum;
    }
}
