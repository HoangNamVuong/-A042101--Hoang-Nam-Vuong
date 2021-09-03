package lesson13_linearSearch_and_binarySearch.practice.binary_search;

import java.util.Scanner;

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of list:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter element of list " + (i +1));
            list[i] = scanner.nextInt();
        }
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("Index of value");
        System.out.println(BinarySearch.binarySearch(list,2));
    }
}
