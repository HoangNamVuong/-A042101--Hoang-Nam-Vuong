package lesson03_array_and_method_in_java.exercise;

import java.util.Scanner;

public class ExerciseMore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeTwoArray input = new MergeTwoArray();
        int[] array = input.enterArray();
//        System.out.println("Sum integers is: " + sumIntegers(array));
//        System.out.println("Enter number:");
//        int inputNumber = scanner.nextInt();
//        findIndexInArray(array, inputNumber);
        for (int x: selectionSort(array))
        System.out.println(x);
    }

    public static int sumIntegers(int[] array) {
        int sum = 0;
        for (int i = 1; i <= array.length; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void findIndexInArray(int[] array, int inputNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == inputNumber) {
                System.out.println("Find element " + inputNumber + " at index " + i);
            }
        }
    }

    public static int[] selectionSort(int... array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
