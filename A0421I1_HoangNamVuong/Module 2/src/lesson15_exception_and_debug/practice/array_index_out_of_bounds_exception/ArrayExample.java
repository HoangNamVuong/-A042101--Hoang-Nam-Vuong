package lesson15_exception_and_debug.practice.array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a element: ");
        int input = scanner.nextInt();
        try {
            System.out.println("Element " + input + " have index is: " + array[input]);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("index more than array");
        }
    }

    public static Integer[] createRandom() {
        Random rd = new Random();
        Integer[] array = new Integer[100];
        System.out.println("display element of array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
            System.out.println(array[i] + " ");
        }
        return array;
    }
}
